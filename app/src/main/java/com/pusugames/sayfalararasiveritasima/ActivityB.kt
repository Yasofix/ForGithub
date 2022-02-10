package com.pusugames.sayfalararasiveritasima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val gelenmesaj= intent.getStringExtra("mesaj")
        val gelenyas = intent.getIntExtra("yas",0)
        val gelenboy = intent.getDoubleExtra("boy",0.0)

        Log.e("Mesaj",gelenmesaj.toString())
        Log.e("Yaş",gelenyas.toString())
        Log.e("Boy",gelenboy.toString())
        val gelenkisi = intent.getSerializableExtra("nesne") as Kisiler
        Log.e("Kişi TCNO",(gelenkisi.tcno).toString())
        Log.e("Kişi İsim",(gelenkisi.isim))
        Log.e("Kişi Boy",(gelenkisi.boy).toString())





    }
}