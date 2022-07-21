package com.example.a6hw5.core

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding


abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {
    protected lateinit var binding: VB
    protected abstract fun inflateViewBinding(): VB
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflateViewBinding()
        setContentView(binding.root)
        checkInternet()
        initViewModel()
        setUI()
        setupObservers()
        initClickListeners()
    }

    abstract fun initViewModel()

    abstract fun checkInternet()

    abstract fun initClickListeners()

    abstract fun setupObservers()

    abstract fun setUI()
}