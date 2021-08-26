package com.rick.kroadmapandroid.Items

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.rick.kroadmapandroid.R

class Android_SDK : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_sdk)
    }

    fun sdk_voltar(view: View) {
        finish()
    }
}