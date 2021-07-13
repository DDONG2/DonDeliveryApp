package com.example.dondeliveryapp.utils.mapper

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.dondeliveryapp.databinding.ViewholderEmptyBinding
import com.example.dondeliveryapp.model.CellType
import com.example.dondeliveryapp.model.Model
import com.example.dondeliveryapp.screen.base.BaseViewModel
import com.example.dondeliveryapp.utils.provider.ResourcesProvider
import com.example.dondeliveryapp.widget.adapter.viewholder.EmptyViewHolder
import com.example.dondeliveryapp.widget.adapter.viewholder.ModelViewHolder

object ModelViewHolderMapper {

    @Suppress("UNCHECKED_CAST")
    fun <M: Model> map(parent: ViewGroup, type: CellType, viewModel: BaseViewModel, resourcesProvider: ResourcesProvider): ModelViewHolder<M> {
        val inflater = LayoutInflater.from(parent.context)
        val viewHolder = when (type) {
            CellType.EMPTY_CELL ->
                EmptyViewHolder(
                    ViewholderEmptyBinding.inflate(inflater, parent, false),
                    viewModel,
                    resourcesProvider
                )

            else -> {

            }
        }
        return viewHolder as ModelViewHolder<M>
    }

}
