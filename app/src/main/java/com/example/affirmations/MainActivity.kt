package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize data. Create an instance of Datasource, call loadAffirmations() method on it.
        val myDataset = Datasource().loadAffirmations()

        /*create a variable called recyclerView and use findViewById() to find a reference to the
            RecyclerView within the layout
        * */
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        //tell the "recyclerView" to use the "ItemAdapter" class, create a new ItemAdapter ith two params(this,myDataset)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)
    }
}