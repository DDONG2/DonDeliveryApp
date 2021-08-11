package com.example.dondeliveryapp.screen.main.home

import com.example.dondeliveryapp.databinding.FragmentHomeBinding
import com.example.dondeliveryapp.screen.base.BaseFragment
import org.koin.android.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>() {

    override val viewModel: HomeViewModel by viewModel<HomeViewModel>()

    override fun getViewBinding(): FragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)

    override fun observeData() {
    }

    companion object{
        fun newInstance() = HomeFragment()

        const val TAG = "MainFragment"
    }

}
