package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) {

    //override adapter methods
    class ItemAdapter(
        private val context: Context,
        private val dataset: List<Affirmation>
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    // ItemViewHolder is only used by ItemAdapter
    // ItemViewHolder is a subclass of recyclerView.ViewHolder, and pass the "view" param into the superclass constructor.
    // define a val property of textView that is of type TextView. Assign the view with ID "item_view".
        class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
            val textView: TextView = view.findViewById(R.id.item_title)
        }

        //abstract methods from RecyclerView.Adapter you need to implement: getItemCount(), onCreateViewHolder(), and onBindViewHolder().
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
            //obtain an instance of Layout of
            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)
            return ItemViewHolder(adapterLayout)
        }

        override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
            TODO("Not yet implemented")
        }

        override fun getItemCount(): Int {
            return dataset.size
        }

    }

}