package com.dicoding.goldenjoystickawards10th

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvGames: RecyclerView
    private var list: ArrayList<Game> = arrayListOf()
    private var title: String = "List of GOTY (2011 - 2021)"

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
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun setMode(selectedMode : Int) {
        when(selectedMode){
            R.id.about -> {
                val about = Intent(this@MainActivity, About::class.java)
                startActivity(about)
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
}