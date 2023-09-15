package com.example.englishcards.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding

@Suppress("UNREACHABLE_CODE")
abstract class BaseFragment<Vb: ViewBinding> : Fragment() {
    protected lateinit var binding: Vb
    protected abstract fun inflateViewBinding(): Vb

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = inflateViewBinding()
        return binding.root
        initView()
        initListener()
    }
    open fun initView() {}
    open fun initListener() {}
}