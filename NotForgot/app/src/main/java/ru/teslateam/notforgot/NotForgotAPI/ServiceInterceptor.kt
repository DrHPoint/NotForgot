package ru.teslateam.notforgot.NotForgotAPI

import android.content.SharedPreferences
import okhttp3.Interceptor
import okhttp3.Response

class ServiceInterceptor(pref: SharedPreferences) : Interceptor {

    val APP_PREFERENCES_TOKEN = "token"
    private var token : String? = ""

    init{
        token = pref.getString(APP_PREFERENCES_TOKEN, token)
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()

        if(request.header("No-Authentication") == null){
            if(!token.isNullOrEmpty())
            {
                val finalToken =  "Bearer "+token
                request = request.newBuilder()
                    .addHeader("Authorization",finalToken)
                    .build()
            }
        }

        return chain.proceed(request)
    }

}
