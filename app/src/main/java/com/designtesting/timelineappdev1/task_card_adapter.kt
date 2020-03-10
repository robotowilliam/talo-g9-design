package com.designtesting.timelineappdev1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*
import kotlinx.android.synthetic.main.main_menu.view.*


class task_card_adapter(val context: Context, val tasks: List<Task>) : RecyclerView.Adapter<task_card_adapter.MyViewHolder>(){


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun setData(task: Task?, pos: Int) {
            itemView.txvTitle.text = task!!.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.main_menu, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return tasks.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val task = tasks[position]
        holder.setData(task, position)
    }

}
