package com.ugurcangal.artbookhiltandtesting.repo

import androidx.lifecycle.LiveData
import com.ugurcangal.artbookhiltandtesting.model.ImageResponse
import com.ugurcangal.artbookhiltandtesting.roomdb.Art
import com.ugurcangal.artbookhiltandtesting.util.Resource

interface ArtRepositoryInterface {

    suspend fun insertArt(art : Art)

    suspend fun deleteArt(art: Art)

    fun getArt() : LiveData<List<Art>>

    suspend fun searchImage(imageString: String) : Resource<ImageResponse>

}