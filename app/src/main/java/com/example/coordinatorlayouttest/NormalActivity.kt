package com.example.coordinatorlayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.view.WindowCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton

class NormalActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val dataList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_normal)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        initData()
        recyclerView = findViewById(R.id.rv)
        val collapsing = findViewById<CollapsingToolbarLayout>(R.id.collapsing)
        val toTop = findViewById<FloatingActionButton>(R.id.to_top)
        collapsing.title = "折叠标题"
        val adapter = RvAdapter(dataList)
        recyclerView.layoutManager  = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                if (recyclerView.scrollState != 0) {
                    toTop.visibility = View.GONE
                } else {
                    toTop.visibility = View.VISIBLE
                }
            }

        })
        toTop.setOnClickListener {
            recyclerView.smoothScrollToPosition(0)
        }
    }

    private fun initData() {
        repeat(50) {
            dataList.add("第${it + 1}个数据")
        }
    }

}