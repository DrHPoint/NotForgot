package ru.teslateam.notforgot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*val user = UserDb.getCurrentUser()
        routeToAppropriatePage(user)
        finish()*/

        /*val newIntent = Intent(this, RegistrationActivity::class.java)
        startActivity(newIntent)
        finish()*/
    }

    /*private fun routeToAppropriatePage(user: User?) {
        when (user) {
            null -> AuthorizationActivity.start(this)
            else -> HomeActivity.start(this)
        }
    }*/
}
