package com.example.k1l1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val filmAdapter: FilmAdapter by lazy {
        FilmAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main()

        Test.print()

        supportActionBar?.title = getFullName(packageName, getString(R.string.app_name))


        button.setOnClickListener {
            filmAdapter.setFilmList(Repository.filmList)
            filmAdapter.let {
                val layoutManager = LinearLayoutManager(this)
                films_rv.layoutManager =
                    layoutManager
                films_rv.adapter = it
                films_rv.addItemDecoration(
                    DividerItemDecoration(
                        this,
                        DividerItemDecoration.VERTICAL
                    )
                )
                it.notifyDataSetChanged()
            }
        }
    }
}