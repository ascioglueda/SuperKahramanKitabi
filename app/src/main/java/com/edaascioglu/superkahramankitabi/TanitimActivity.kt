package com.edaascioglu.superkahramankitabi

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class TanitimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)
        val intent=intent
        val secilenKahramanIsmi=intent.getStringExtra("superKahramanIsmi")
        textView.text=secilenKahramanIsmi

        val superKahramanGorseli=intent.getIntExtra("superKahramanGorseli",0)
        val bitmap=BitmapFactory.decodeResource((applicationContext.resources,superKahramanGorseli))
        imageView.setImageBitmap(bitmap)

    /*    val secilenKahraman=SingletonClass.SecilenKahraman
        val secilenGorsel=secilenKahraman.gorsel
        imageView.setImageBitmap(secilenGorsel)*/
    }
}