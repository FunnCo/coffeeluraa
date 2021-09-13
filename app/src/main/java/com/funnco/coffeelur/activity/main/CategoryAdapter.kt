package com.funnco.coffeelur.activity.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.funnco.coffeelur.common.data.model.CategoryModel
import com.funnco.coffeelur.databinding.ItemMainMenuBinding
import com.squareup.picasso.Picasso

class CategoryAdapter(val listOfItems: List<CategoryModel>) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {
    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private lateinit var binding: ItemMainMenuBinding

        fun bind(item: CategoryModel){
            binding = ItemMainMenuBinding.bind(itemView)
            binding.itemCategoryName.text = item.name
            Picasso.get().load(item.imageURL).into(binding.itemCategoryImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(ItemMainMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false).root)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(listOfItems[position])
    }

    override fun getItemCount(): Int {
        return listOfItems.size
    }
}