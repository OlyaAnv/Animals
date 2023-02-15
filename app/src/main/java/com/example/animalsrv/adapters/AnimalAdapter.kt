package com.example.animalsrv.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.animalsrv.databinding.AnimalItemBinding

class AnimalAdapter(private var list:ArrayList<Int>):RecyclerView.Adapter<AnimalAdapter.AnimalHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalHolder {
        val binding = AnimalItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return AnimalHolder(binding)
    }

    override fun onBindViewHolder(holder: AnimalHolder, position: Int) {
        holder.binding.imageView.setImageResource(list[position])
    }

    override fun getItemCount(): Int = list.size

    class AnimalHolder(val binding: AnimalItemBinding): RecyclerView.ViewHolder(binding.root)  {

    }
}