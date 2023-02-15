package com.example.animalsrv.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.animalsrv.Category
import com.example.animalsrv.databinding.CategoryItemBinding

class CategoryAdapter(private var listCategory: ArrayList<Category>) :
    RecyclerView.Adapter<CategoryAdapter.CategoryHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        val binding =
            CategoryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        holder.bind(listCategory[position])
//        holder.bind(listCategory[position])
//        holder.binding.textView.text = listCategory[position].text
//        loadRecyclerViewAnimals(holder.binding.rvAnimal,listCategory[position].list)
    }

    override fun getItemCount(): Int = listCategory.size

    class CategoryHolder(private val binding: CategoryItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(category: Category) {
            binding.apply {
                textView.text = category.text
                rvAnimal.adapter = AnimalAdapter(category.list)
                rvAnimal.layoutManager =
                    LinearLayoutManager(binding.root.context, RecyclerView.HORIZONTAL, false)
            }
        }
    }

//    private fun loadRecyclerViewAnimals(recyclerView: RecyclerView, animalsList: ArrayList<Int>) {
//        val adapter = AnimalAdapter(animalsList)
//        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
//        recyclerView.adapter = adapter
//    }
}