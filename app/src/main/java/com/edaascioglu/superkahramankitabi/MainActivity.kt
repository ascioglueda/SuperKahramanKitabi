package com.edaascioglu.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_tanitim.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Veri hazırlığı

        var superKahramanIsimleri=ArrayList<String>()
        superKahramanIsimleri.add("Batman")
        superKahramanIsimleri.add("Superman")
        superKahramanIsimleri.add("Iron Man")
        superKahramanIsimleri.add("Aquaman")
        superKahramanIsimleri.add("Spiderman")

      //Verimsiz Tanımlamalar
       /* val batmanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val supermanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val ironmanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val aquamanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquaman)
        val spidermanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)

        var superKahramanGorselleri=ArrayList<Bitmap>()
            superKahramanGorselleri.add(batmanBitmap)
            superKahramanGorselleri.add(supermanBitmap)
            superKahramanGorselleri.add(ironmanBitmap)
            superKahramanGorselleri.add(aquamanBitmap)
            superKahramanGorselleri.add(spidermanBitmap)*/

        //Verimli Tanımlar

        val batmanDrowableId=R.drawable.batman
        val supermanDrawableId=R.drawable.superman
        val ironmanDrawableId=R.drawable.ironman
        val aquamanDrawableId=R.drawable.aquaman
        val spidermanDrawableId=R.drawable.spiderman

        var superKahramanDrawableListesi=ArrayList<Int>()
        superKahramanDrawableListesi.add(batmanDrowableId)
        superKahramanDrawableListesi.add(supermanDrawableId)
        superKahramanDrawableListesi.add(ironmanDrawableId)
        superKahramanDrawableListesi.add(aquamanDrawableId)
        superKahramanDrawableListesi.add(spidermanDrawableId)





          //Adapter
           val layoutManager=LinearLayoutManager(this)
           recyclerView.layoutManager=layoutManager
           val adapter=RecyclerAdapter(superKahramanIsimleri,superKahramanDrawableListesi)
           recyclerView.adapter=adapter

    }
}