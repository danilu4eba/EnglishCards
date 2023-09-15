package com.example.englishcards.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.englishcards.data.Cards
import com.example.englishcards.databinding.ItemCardBinding

class CardAdapter : ListAdapter<Cards, CardAdapter.TasksViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TasksViewHolder {
        val binding = ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TasksViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TasksViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.bind(currentItem)
    }

    class TasksViewHolder(private val binding: ItemCardBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(cards: Cards) {
            binding.apply {
                tvFirstWord.text = cards.firstWord
                tvTranslate.text = cards.translate
            }
        }
    }

    class DiffCallback : DiffUtil.ItemCallback<Cards>() {
        override fun areItemsTheSame(oldItem: Cards, newItem: Cards) =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Cards, newItem: Cards) =
            oldItem == newItem
    }
}