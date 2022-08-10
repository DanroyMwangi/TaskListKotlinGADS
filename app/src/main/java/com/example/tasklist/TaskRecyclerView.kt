package com.example.tasklist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskRecyclerView(private val context: Context, private val tasks : ArrayList<Task>) : RecyclerView.Adapter<TaskRecyclerView.TaskViewHolder>() {

    class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val taskTitleTV = itemView.findViewById<TextView>(R.id.taskTitleTV)
        val isCompleted = itemView.findViewById<CheckBox>(R.id.taskDoneCB)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.task_item,parent,false)
        return TaskViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val currentTask = tasks[position]

        holder.taskTitleTV.text = currentTask.taskName
        holder.isCompleted
    }

    override fun getItemCount(): Int {
        return tasks.size
    }
}