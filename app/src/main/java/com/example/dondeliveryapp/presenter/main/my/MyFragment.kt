package com.example.dondeliveryapp.presenter.main.my

import androidx.fragment.app.viewModels
import com.example.dondeliveryapp.databinding.FragmentMyBinding
import com.example.dondeliveryapp.presenter.base.BaseFragment

class MyFragment : BaseFragment<MyViewModel, FragmentMyBinding>() {

    override val viewModel: MyViewModel by viewModels<MyViewModel>()

    override fun getViewBinding(): FragmentMyBinding = FragmentMyBinding.inflate(layoutInflater)

    override fun observeData() {

    }

    companion object{
        fun newInstance() = MyFragment()

        const val TAG = "MyFragment"
    }
}
