package com.android.mrt.common.base

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.mrt.common.interfaces.OnItemStateChangeListener

/**
 * Created by Mr.T on 2018/3/17.
 */
abstract class BaseRecyclerAdapter<H : BaseRecyclerAdapter.ViewHolder<D>, D> : RecyclerView.Adapter<H>() {

    protected abstract val mItemViewRes: Int
    protected var mDatas: MutableList<D>? = null
        set(value) {
            field = value
            notifyDataSetChanged()
        }
    private var mOnItemStateChangeListener: OnItemStateChangeListener<D>? = null

    abstract fun createViewHolder(view: View): H

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): H {
        val holder = createViewHolder(LayoutInflater.from(parent.context).inflate(mItemViewRes, parent, false))
        holder.onItemStateChange(mOnItemStateChangeListener)
        return holder
    }

    override fun onBindViewHolder(holder: H, position: Int) {
        holder.mBindData = mDatas?.get(position)
        holder.mPosition = position
        holder.setData()
    }

    override fun getItemCount(): Int = mDatas?.size ?: 0

    abstract class ViewHolder<D>(private var mItemView: View) : RecyclerView.ViewHolder(mItemView) {

        var mBindData: D? = null
        var mPosition: Int = -1

        abstract fun setData()

        fun onItemStateChange(listener: OnItemStateChangeListener<D>?) {
            mItemView.setOnClickListener {
                listener?.onItemClick(this)
            }
            mItemView.setOnKeyListener { _, keyCode, event ->
                listener?.onItemKey(this, keyCode, event)
                false
            }
            mItemView.setOnFocusChangeListener { _, hasFocus ->
                listener?.onItemFocus(this, hasFocus)
            }
        }
    }
}