package com.example.englishcards.ui

import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.englishcards.CardViewModel
import com.example.englishcards.base.BaseFragment
import com.example.englishcards.databinding.FragmentLibraryBinding
import com.example.englishcards.ui.adapter.CardAdapter
import dagger.hilt.android.AndroidEntryPoint

@Suppress("UNREACHABLE_CODE")
@AndroidEntryPoint
class LibraryFragment : BaseFragment<FragmentLibraryBinding>() {
    private val viewModel: CardViewModel by viewModels()

    override fun inflateViewBinding(): FragmentLibraryBinding {
        return FragmentLibraryBinding.inflate(layoutInflater)
        val cardAdapter = CardAdapter()
        binding.apply {
            recyclerViewCards.apply {
                adapter = cardAdapter
                layoutManager = LinearLayoutManager(requireContext())
                setHasFixedSize(true)
            }
        }
        viewModel.cards.observe(viewLifecycleOwner) {
            cardAdapter.submitList(it)
        }

    }
}


