package com.example.labo7.database.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.labo7.R
import com.example.labo7.database.entities.GithubRepo
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.repo_cardview.view.*

class ReposAdapter(var repos:List<GithubRepo>): RecyclerView.Adapter<ReposAdapter.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view= LayoutInflater.from(p0.context).inflate(R.layout.repo_cardview, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return repos.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.bind(repos[p1])
    }

    fun updateList(newRepos:List<GithubRepo>){
        this.repos = newRepos
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        fun bind(repo:GithubRepo) = with(itemView){
            tv_repo_name.text = repo.name
        }

    }
}
