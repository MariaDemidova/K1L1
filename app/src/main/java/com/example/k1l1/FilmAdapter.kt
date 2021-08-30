package com.example.k1l1

import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.k1l1.Repository.filmList
import kotlinx.android.synthetic.main.item_film.view.*
import java.text.SimpleDateFormat

class FilmAdapter : RecyclerView.Adapter<FilmAdapter.ViewHolder>() {

    var filmList: List<Film> = ArrayList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(film: Film) {
            itemView.name.text = film.name
            itemView.ganre.text = film.ganre
            itemView.date.text = film.date.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_film, parent, false)
        )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(filmList[position])
    }

    override fun getItemCount(): Int = Repository.filmList.size

    internal fun setFilmList (filmList : List<Film>){
        this.filmList = filmList
        notifyDataSetChanged()
    }

}

