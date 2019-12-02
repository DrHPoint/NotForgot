package ru.teslateam.notforgot.models

import retrofit2.Call
import retrofit2.http.*

interface NotForgotService {
    @POST("/register")
    fun postNewUser(@Query("email") email: String, @Query("name") name: String, @Query("password") password: String): Call<RequestRegister>

    @POST("/login")
    fun postUser(@Query("email") email: String, @Query("password") password: String): Call<ReguestAuthorization>

    @GET("/priorities")
    fun getPriorities(): Call<List<ReguestPriorities>>

    @GET("/categories")
    fun getCategories(): Call<List<RequestCategories>>

    @POST("/categories")
    fun postCategories(@Query("name") name: String): Call<RequestCategories>

    @GET("/tasks")
    fun getTasks(): Call<List<RequestTasks>>

    @POST("/tasks")
    fun postTasks(@Query("title") title: String, @Query("description") description: String, @Query("done") done: Int, @Query("deadline") deadline: Int, @Query("category_id") category_id: Int, @Query("priority_id") priority_id: Int): Call<RequestTasks>

    @PATCH("/tasks/{id}")
    fun patchTasks(@Path("id") id: Int, @Query("title") title: String, @Query("description") description: String, @Query("done") done: Int, @Query("deadline") deadline: Int, @Query("category_id") category_id: Int, @Query("priority_id") priority_id: Int): Call<RequestTasks>

    @DELETE("/tasks/{id}")
    fun deleteTasks(@Path("id") id: Int)

}