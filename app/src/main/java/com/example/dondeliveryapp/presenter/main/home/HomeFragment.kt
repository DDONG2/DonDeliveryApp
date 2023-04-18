package com.example.dondeliveryapp.presenter.main.home

import androidx.fragment.app.viewModels
import com.example.dondeliveryapp.databinding.FragmentHomeBinding
import com.example.dondeliveryapp.presenter.base.BaseFragment

class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>() {

    override val viewModel: HomeViewModel by viewModels<HomeViewModel>()

    override fun getViewBinding(): FragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)

    override fun observeData() {
    }

    companion object{
        fun newInstance() = HomeFragment()

        const val TAG = "MainFragment"
    }

}
