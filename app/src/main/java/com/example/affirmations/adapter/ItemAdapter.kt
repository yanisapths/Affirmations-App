package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

    //override adapter methods
    class ItemAdapter(
        private val context: Context,
        private val dataset: List<Affirmation>
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
/* abstract methods from RecyclerView.Adapter you need to implement: getItemCount(), onCreateViewHolder(), and onBindViewHolder(). */

    // ItemViewHolder is only used by ItemAdapter
    // ItemViewHolder is a subclass of recyclerView.ViewHolder, and pass the "view" param into the superclass constructor.
    // define a val property of textView that is of type TextView. Assign the view with ID "item_title".
        class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
            val textView: TextView = view.findViewById(R.id.item_title)
        }



        /* create new views */
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
            //obtain an instance of Layout of LayoutInflater from the provided context, the layout inflater knows how to inflate an xml layout into hierarchy of view objects.
            //create a new view
            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)

            return ItemViewHolder(adapterLayout)
        }

        //this method is called by the layout manager to replace the contents of a list item view.
        //finally, update all the views referenced by the view holder to reflect the correct data for this item.
        //only one view in this--> TextView within ItemViewHolder
        //set the TextView to display the Affirmation string for this item

        /* Replace the contents of a view */
        override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
            val item = dataset[position]
            //updates the view holder to show the affirmation string.
            holder.textView.text = context.resources.getString(item.stringResourceId)
        }

        /* Return the size of dataset */
        override fun getItemCount(): Int {
            return dataset.size
        }

    }
