package com.example.tasklist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val taskRV = findViewById<RecyclerView>(R.id.taskRV)
        val addBtn = findViewById<Button>(R.id.addBtn)
        val taskET = findViewById<EditText>(R.id.taskTitleET)

        val tasks : ArrayList<Task> = ArrayList()
        //Store any task entered in the Edit Text in a mutable list
        addBtn.setOnClickListener{
            tasks.add(Task(taskET.text.toString(),false))
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            taskRV.adapter = TaskRecyclerView(this,tasks)
        }

        taskRV.layoutManager =  LinearLayoutManager(this)
    }
}