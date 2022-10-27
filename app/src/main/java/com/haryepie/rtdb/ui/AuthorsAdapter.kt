package com.haryepie.rtdb.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.haryepie.rtdb.R
import com.haryepie.rtdb.data.Author
import kotlinx.android.synthetic.main.recycler_view_author.view.*

class AuthorsAdapter : RecyclerView.Adapter<AuthorsAdapter.AuthorViewModel>(){

    private var authors = mutableListOf<Author>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = AuthorViewModel(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_author,parent,false)
    )

    override fun getItemCount() = authors.size

    override fun onBindViewHolder(holder: AuthorViewModel, position: Int) {
        holder.view.text_view_name.text = authors[position].name
    }

    fun setAuthors(authors: List<Author>){
        this.authors = authors as MutableList<Author>
        notifyDataSetChanged()
    }



    class AuthorViewModel(val view: View) : RecyclerView.ViewHolder(view)
}