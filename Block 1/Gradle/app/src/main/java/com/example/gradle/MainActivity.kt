package com.example.gradle

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = """
            Flavor = ${BuildConfig.FLAVOR}
            Build type = ${BuildConfig.BUILD_TYPE}
            Version code = ${BuildConfig.VERSION_CODE}
            Version name = ${BuildConfig.VERSION_NAME}
            Application id = ${BuildConfig.APPLICATION_ID}
        """.trimIndent()
    }
}
