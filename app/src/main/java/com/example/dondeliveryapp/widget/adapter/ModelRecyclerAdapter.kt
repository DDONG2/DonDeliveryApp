package com.example.dondeliveryapp.widget.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.dondeliveryapp.DonApplication
import com.example.dondeliveryapp.model.CellType
import com.example.dondeliveryapp.model.Model
import com.example.dondeliveryapp.screen.base.BaseViewModel
import com.example.dondeliveryapp.utils.mapper.ModelViewHolderMapper
import com.example.dondeliveryapp.utils.provider.DefaultResourcesProvider
import com.example.dondeliveryapp.utils.provider.ResourcesProvider
import com.example.dondeliveryapp.widget.adapter.listener.AdapterListener
import com.example.dondeliveryapp.widget.adapter.viewholder.ModelViewHolder

class ModelRecyclerAdapter<M : Model, VM: BaseViewModel>(
        private var modelList: List<Model>,
        private var viewModel: VM,
        private val resourcesProvider: ResourcesProvider = DefaultResourcesProvider(DonApplication.appContext!!),
        private val adapterListener: AdapterListener
) : ListAdapter<Model, ModelViewHolder<M>>(Model.DIFF_CALLBACK) {

    override fun getItemCount(): Int = modelList.size


    override fun getItemViewType(position: Int) = modelList[position].type.ordinal


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder<M> {
        return ModelViewHolderMapper.map(parent, CellType.values()[viewType], viewModel, resourcesProvider)
    }

    override fun onBindViewHolder(holder: ModelViewHolder<M>, position: Int) {
        with(holder) {
            bindData(modelList[position] as M)
            bindViews(modelList[position] as M, adapterListener)
        }
    }

    override fun submitList(list: MutableList<Model>?) {
        list?.let { modelList = it }
        super.submitList(list)
    }
}