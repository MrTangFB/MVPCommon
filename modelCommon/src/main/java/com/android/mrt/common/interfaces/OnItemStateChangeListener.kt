package com.android.mrt.common.interfaces

import android.view.KeyEvent
import com.android.mrt.common.base.BaseRecyclerAdapter

/**
 * Created by Mr.T on 2018/3/17.
 */
interface OnItemStateChangeListener<D> {

    fun onItemClick(viewHolder: BaseRecyclerAdapter.ViewHolder<D>)

    fun onItemKey(viewHolder: BaseRecyclerAdapter.ViewHolder<D>, keyCode: Int, event: KeyEvent)

    fun onItemFocus(viewHolder: BaseRecyclerAdapter.ViewHolder<D>, hasFocus: Boolean)
}