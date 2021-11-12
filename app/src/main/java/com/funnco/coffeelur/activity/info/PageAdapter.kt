package com.funnco.coffeelur.activity.info

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.funnco.coffeelur.common.data.Repository
import com.funnco.coffeelur.common.data.model.CoffeeModel
import com.funnco.coffeelur.databinding.PageInfoBinding
import com.squareup.picasso.Picasso

class PageAdapter(val listOfItems: List<CoffeeModel>) :
    RecyclerView.Adapter<PageAdapter.PageViewHolder>() {

    class PageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private lateinit var binding: PageInfoBinding

        fun bind(item: CoffeeModel) {
            binding = PageInfoBinding.bind(itemView)
            binding.itemPageTextName.text = item.name
            binding.itemPageTextDescription.text = item.description
            Picasso.get().load(item.photoURL).into(binding.itemPageImage)

            binding.itemPageFabPlus.setOnClickListener {
                binding.itemPageTextCount.text =
                    (Integer.parseInt(binding.itemPageTextCount.text.toString()) + 1).toString()
                Repository.orders.add(item)
            }

            binding.itemPageFabMinus.setOnClickListener {
                if (Integer.parseInt(binding.itemPageTextCount.text.toString()) > 0) {
                    binding.itemPageTextCount.text =
                        (Integer.parseInt(binding.itemPageTextCount.text.toString()) - 1).toString()
                    Repository.orders.remove(item)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PageViewHolder {
        return PageViewHolder(
            PageInfoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ).root
        )
    }

    override fun onBindViewHolder(holder: PageViewHolder, position: Int) {
        holder.bind(listOfItems[position])
    }

    override fun getItemCount(): Int {
        return listOfItems.size
    }

}