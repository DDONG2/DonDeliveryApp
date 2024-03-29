package com.example.dondeliveryapp.presenter.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import kotlinx.coroutines.Job

abstract class BaseActivity<VM: BaseViewModel, VB: ViewBinding> : AppCompatActivity(){

    abstract  val viewModel: VM

    protected lateinit var binding: VB

    abstract fun getViewBinding() : VB

    private lateinit var fetchJob: Job

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = getViewBinding()
        setContentView(binding.root)
        initState()
    }

    open fun initState(){
        initViews() // 뷰 초기화
        fetchJob = viewModel.fetchData()
        observeData()
    }

    open fun initViews() = Unit


    abstract  fun observeData()

    override fun onDestroy() {
        if(fetchJob.isActive){
            fetchJob.cancel()
        }
        super.onDestroy()
    }



}