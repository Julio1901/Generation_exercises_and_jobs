package com.julio.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.julio.affirmations.adapter.ItemAdapter
import com.julio.affirmations.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = DataSource().loadAffirmations()
        val recycleView = findViewById<RecyclerView>(R.id.recycler_view)

        recycleView.adapter = ItemAdapter(this, myDataset)
        recycleView.setHasFixedSize(true)


    }
}