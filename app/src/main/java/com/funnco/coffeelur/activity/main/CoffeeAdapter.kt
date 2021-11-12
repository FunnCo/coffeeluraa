package com.funnco.coffeelur.activity.main

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.funnco.coffeelur.activity.info.InfoActivity
import com.funnco.coffeelur.common.data.Repository
import com.funnco.coffeelur.common.data.model.CoffeeModel
import com.funnco.coffeelur.databinding.ItemMainCoffeeBinding
import com.squareup.picasso.Picasso

class CoffeeAdapter(val listOfItems: List<CoffeeModel>, val context: Context) :
    RecyclerView.Adapter<CoffeeAdapter.CoffeeViewHolder>() {
    class CoffeeViewHolder(itemView: View, val context: Context) : RecyclerView.ViewHolder(itemView) {

        private lateinit var binding: ItemMainCoffeeBinding

        fun bind(item: CoffeeModel) {
            binding = ItemMainCoffeeBinding.bind(itemView)
            binding.itemMainCoffeeName.text = item.name
            binding.itemMainCoffeeDescription.text = item.shortDescription
            binding.itemMainCoffeePrice.text = item.price.toString()
            Picasso.get().load(item.photoURL).into(binding.itemMainCoffeeImage)

            binding.itemMainCoffeePesan.isEnabled = false

            binding.root.setOnClickListener {
                if (!binding.itemMainCoffeePesan.isEnabled) {
                    Repository.orders.add(item)
                    Log.i("TAG", "Order added " + Repository.orders.size)
                } else {
                    Log.i("TAG", "Order removed "+ Repository.orders.size)
                    Repository.orders.remove(item)
                }
                binding.itemMainCoffeePesan.isEnabled = !binding.itemMainCoffeePesan.isEnabled
            }

            binding.itemMainCoffeePesan.setOnClickListener {
                context.startActivity(Intent(context, InfoActivity::class.java))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeeViewHolder {
        return CoffeeViewHolder(
            ItemMainCoffeeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ).root
        , context)
    }

    override fun onBindViewHolder(holder: CoffeeViewHolder, position: Int) {
        holder.bind(listOfItems[position])
    }

    override fun getItemCount(): Int {
        return listOfItems.size
    }
}