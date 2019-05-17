package com.example.labo7.database.repositories

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.labo7.database.daos.GithubRepoDAO
import com.example.labo7.database.entities.GithubRepo

class GithubRepoRepository(private val repoDAO: GithubRepoDAO){

    fun getAll():LiveData<List<GithubRepo>> = repoDAO.getAll()

    fun nuke()=repoDAO.nukeTable()

    @WorkerThread
    suspend fun insert(repo:GithubRepo) = repoDAO.insert(repo)

}