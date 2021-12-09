package com.dicoding.goldenjoystickawards10th

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.lang.StringBuilder

class ListGamesAdapter(private val listGames: ArrayList<Game>) :
    RecyclerView.Adapter<ListGamesAdapter.listViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class listViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_game_name)
        var tvYear: TextView = itemView.findViewById(R.id.tv_year_of_win)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_game)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListGamesAdapter.listViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_game, parent, false)
        return listViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListGamesAdapter.listViewHolder, position: Int) {
        val game = listGames[position]
        val goty = StringBuilder()
        goty.append("Game of The Year ").append(game.year)
        Glide.with(holder.itemView.context).load(game.photo)
            .apply(RequestOptions().override(60, 60)).into(holder.imgPhoto)
        holder.tvName.text = game.name
        holder.tvYear.text = goty

        val contextGame = holder.itemView.context

        holder.itemView.setOnClickListener {
            val toDetail = Intent(contextGame, DetailGame::class.java)
            toDetail.putExtra(DetailGame.GAME_NAME, game.name)
            toDetail.putExtra(DetailGame.GAME_IMAGE, game.photo)
            toDetail.putExtra(DetailGame.GAME_DETAIL, game.detail)
            contextGame.startActivity(toDetail)
        }
    }

    override fun getItemCount(): Int {
        return listGames.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Game)
    }
}