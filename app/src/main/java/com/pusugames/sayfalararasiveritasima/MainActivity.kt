package com.pusugames.sayfalararasiveritasima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonGonder.setOnClickListener {

            val kisi = Kisiler(999999,"Ahmet",1.98)
            val yeniintent = Intent(this@MainActivity,ActivityB::class.java)
            yeniintent.putExtra("mesaj","Merhaba")
            yeniintent.putExtra("yas",23)
            yeniintent.putExtra("boy",1.78)
            yeniintent.putExtra("nesne",kisi)
            startActivity(yeniintent)


        }

    }
}