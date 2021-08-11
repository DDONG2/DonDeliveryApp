package com.example.dondeliveryapp.screen.main.my

import com.example.dondeliveryapp.databinding.FragmentHomeBinding
import com.example.dondeliveryapp.databinding.FragmentMyBinding
import com.example.dondeliveryapp.screen.base.BaseFragment
import com.example.dondeliveryapp.screen.main.home.HomeFragment
import org.koin.android.viewmodel.ext.android.viewModel

class MyFragment : BaseFragment<MyViewModel, FragmentMyBinding>() {

    override val viewModel: MyViewModel by viewModel<MyViewModel>()

    override fun getViewBinding(): FragmentMyBinding = FragmentMyBinding.inflate(layoutInflater)

    override fun observeData() {

    }

    companion object{
        fun newInstance() = MyFragment()

        const val TAG = "MyFragment"
    }
}
