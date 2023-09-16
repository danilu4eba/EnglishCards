package com.example.englishcards.ui.library

import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.englishcards.base.BaseFragment
import com.example.englishcards.databinding.FragmentLibraryBinding
import com.example.englishcards.ui.library.adapter.CardAdapter
import dagger.hilt.android.AndroidEntryPoint


class LibraryFragment : BaseFragment<FragmentLibraryBinding>() {
    private val viewModel: CardViewModel by viewModels()

    override fun inflateViewBinding(): FragmentLibraryBinding {
        return FragmentLibraryBinding.inflate(layoutInflater)
    }
}


