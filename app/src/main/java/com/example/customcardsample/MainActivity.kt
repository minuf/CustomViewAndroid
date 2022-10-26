package com.example.customcardsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customcardsample.ui.cards.CardsFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, CardsFragment.newInstance())
                .commitNow()
        }
    }
}