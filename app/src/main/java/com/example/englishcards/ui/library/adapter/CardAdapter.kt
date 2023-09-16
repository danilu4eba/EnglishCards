package com.example.englishcards.ui.library.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.englishcards.data.model.Cards
import com.example.englishcards.databinding.ItemCardBinding

class CardAdapter : ListAdapter<Cards, CardAdapter.CardViewHolder>(DiffCallback()) {

    class CardViewHolder(private val binding: ItemCardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(cards: Cards) {
            binding.apply {
                tvFirstWord.text = cards.firstWord
                tvTranslate.text = cards.translate
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val binding = ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.bind(currentItem)
    }

    class DiffCallback : DiffUtil.ItemCallback<Cards>() {
        override fun areItemsTheSame(oldItem: Cards, newItem: Cards) =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Cards, newItem: Cards) =
            oldItem == newItem
    }
}