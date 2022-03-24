package com.example.week4hw1

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {

    var editText: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.MANAGE_EXTERNAL_STORAGE), 25)
        setContentView(R.layout.activity_main)

        editText = findViewById<View>(R.id.dls) as TextView
    }

    fun findDownloads(view: View) {
        val folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)

        editText!!.setText("External folders are saved at" + folder.toString())

    }
}