package com.dicoding.goldenjoystickawards10th

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvGames: RecyclerView
    private var list: ArrayList<Game> = arrayListOf()
    private var title: String = "List of GOTY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvGames = findViewById(R.id.rv_games)
        rvGames.setHasFixedSize(true)

        list.addAll(GamesData.listGames)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvGames.layoutManager = LinearLayoutManager(this)
        val listGamesAdapter = ListGamesAdapter(list)
        rvGames.adapter = listGamesAdapter

        listGamesAdapter.setOnItemClickCallback(object : ListGamesAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Game) {
                showSelectedGame(data)
            }
        })
    }

    private fun showSelectedGame(game: Game) {
        Toast.makeText(this, "Kamu memilih " + game.name, Toast.LENGTH_SHORT).show()
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}