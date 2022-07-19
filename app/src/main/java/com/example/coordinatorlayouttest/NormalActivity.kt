package com.example.coordinatorlayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NormalActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val dataList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_normal)
        initData()
        recyclerView = findViewById(R.id.rv)
        val adapter = RvAdapter(dataList)
        recyclerView.layoutManager  = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun initData() {
        repeat(20) {
            dataList.add("第${it}个数据")
        }
    }

}