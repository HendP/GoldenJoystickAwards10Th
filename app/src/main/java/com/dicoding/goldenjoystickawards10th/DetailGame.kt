package com.dicoding.goldenjoystickawards10th

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailGame : AppCompatActivity() {

    companion object {
        const val GAME_NAME = "Game Name"
        const val GAME_IMAGE = "Game Image"
        const val GAME_DETAIL = "Game Detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_game)

        val tvGameName: TextView = findViewById(R.id.game_name)
        val imgGame: ImageView = findViewById(R.id.game_image)
        val tvGameDetail: TextView = findViewById(R.id.game_detail)

        val gameName = intent.getStringExtra(GAME_NAME)
        val gameImage = intent.getIntExtra(GAME_IMAGE, 0)
        val gameDetail = intent.getStringExtra(GAME_DETAIL)

        tvGameName.text = gameName
        Glide.with(this).load(gameImage).apply(RequestOptions()).into(imgGame)
        tvGameDetail.text = gameDetail
    }
}