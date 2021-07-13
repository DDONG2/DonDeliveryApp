package com.example.dondeliveryapp.widget.adapter.viewholder

import com.example.dondeliveryapp.databinding.ViewholderEmptyBinding
import com.example.dondeliveryapp.model.Model
import com.example.dondeliveryapp.screen.base.BaseViewModel
import com.example.dondeliveryapp.utils.provider.ResourcesProvider
import com.example.dondeliveryapp.widget.adapter.listener.AdapterListener

class EmptyViewHolder(
    private val binding: ViewholderEmptyBinding,
     viewModel: BaseViewModel,
     resourcesProvider: ResourcesProvider
): ModelViewHolder<Model>(binding, viewModel, resourcesProvider) {

    override fun reset() = Unit

    override fun bindViews(model: Model, adapterListener: AdapterListener) = Unit
}