package ru.teslateam.notforgot

import android.content.Intent
import com.google.gson.Gson
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.teslateam.notforgot.models.ListModel
import java.io.BufferedReader

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*var gson = Gson()
        val bufferedReader: BufferedReader = resources.openRawResource(R.raw.currentlist).bufferedReader()
        val inputString = bufferedReader.use { it.readText() }
        val user = gson.fromJson(inputString, ListModel::class.java)
        routeToAppropriatePage(user.user)
        finish()*/

    }

    /*private fun routeToAppropriatePage(user: Boolean) {
        when (user) {
            false -> {
            val newIntent = Intent(this, AuthorizationActivity::class.java)
            startActivity(newIntent)
            }
            else -> {
            val newIntent = Intent(this, HomeActivity::class.java)
            startActivity(newIntent)
            }
        }
    }*/
}
