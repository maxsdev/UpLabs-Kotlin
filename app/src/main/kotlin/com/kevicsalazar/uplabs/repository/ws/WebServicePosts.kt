package com.kevicsalazar.uplabs.repository.ws

import com.google.gson.JsonArray
import com.kevicsalazar.uplabs.PerApp
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import javax.inject.Inject

/**
 * @author Kevin Salazar
 * @link kevicsalazar.com
 */
@PerApp
class WebServicePosts @Inject constructor(val service: Service) {

    fun getPosts(type: String): Call<JsonArray> {
        return service.getPosts("https://$type.uplabs.com/posts", "1")
    }

    interface Service {

        @GET("{path}")
        fun getPosts(@Path(value = "path", encoded = true) path: String, @Query("page") page: String): Call<JsonArray>

    }

}