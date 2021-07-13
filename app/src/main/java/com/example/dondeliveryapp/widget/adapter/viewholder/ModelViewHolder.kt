package com.example.dondeliveryapp.widget.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.dondeliveryapp.model.Model
import com.example.dondeliveryapp.screen.base.BaseViewModel
import com.example.dondeliveryapp.utils.provider.ResourcesProvider
import com.example.dondeliveryapp.widget.adapter.listener.AdapterListener

abstract class ModelViewHolder<M: Model>(
    binding: ViewBinding,
    protected val viewModel: BaseViewModel,
    protected val resourcesProvider: ResourcesProvider
) : RecyclerView.ViewHolder(binding.root) {

    abstract fun reset()

    open fun bindData(model: M) {
        reset()
    }

    abstract fun bindViews(model: M, adapterListener: AdapterListener)

}
