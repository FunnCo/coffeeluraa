package com.funnco.coffeelur.activity.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.funnco.coffeelur.common.data.model.CoffeeModel
import com.funnco.coffeelur.databinding.ItemMainCoffeeBinding
import com.squareup.picasso.Picasso

class CoffeeAdapter(val listOfItems: List<CoffeeModel>) : RecyclerView.Adapter<CoffeeAdapter.CoffeeViewHolder>() {
    class CoffeeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private lateinit var binding: ItemMainCoffeeBinding

        fun bind(item : CoffeeModel){
            binding = ItemMainCoffeeBinding.bind(itemView)
            binding.itemMainCoffeeName.text = item.name
            binding.itemMainCoffeeDescription.text = item.shortDescription
            binding.itemMainCoffeePrice.text = item.price.toString()
            Picasso.get().load(item.photoURL).into(binding.itemMainCoffeeImage)

            binding.itemMainCoffeePesan.isEnabled = false

            binding.root.setOnClickListener {
                binding.itemMainCoffeePesan.isEnabled = !binding.itemMainCoffeePesan.isEnabled
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeeViewHolder {
        return CoffeeViewHolder(ItemMainCoffeeBinding.inflate(LayoutInflater.from(parent.context), parent, false).root)
    }

    override fun onBindViewHolder(holder: CoffeeViewHolder, position: Int) {
        holder.bind(listOfItems[position])
    }

    override fun getItemCount(): Int {
        return listOfItems.size
    }
}