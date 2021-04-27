package com.gett.gett

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.net.Uri

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val connect_button: Button = findViewById(R.id.connect_button)
        val info_button: Button = findViewById(R.id.info_button)

        connect_button.setOnClickListener{
            openNewTabWindow("<your_url>")
            /*val text: String = "It's work!"
            val duration = Toast.LENGTH_LONG

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.setGravity(Gravity.CENTER, 0,0)
            toast.show()*/
        }

        info_button.setOnClickListener{
            startActivity(Intent(this@MainActivity, MainActivity2::class.java))
        }

    }

    fun openNewTabWindow(urls: String) {
        val uris = Uri.parse(urls)
        val intents = Intent(Intent.ACTION_VIEW, uris)
        val b = Bundle()
        b.putBoolean("new_window", true)
        intents.putExtras(b)
        startActivity(intents)
    }

}