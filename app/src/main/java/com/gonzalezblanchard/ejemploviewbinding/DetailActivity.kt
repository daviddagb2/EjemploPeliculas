package com.gonzalezblanchard.ejemploviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gonzalezblanchard.ejemploviewbinding.databinding.ActivityDetailBinding
import com.squareup.picasso.Picasso

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater).apply {
            setContentView(root)

            //Obtenemos valores
            val titulostr = intent.getStringExtra("TITULO")
            val descripcionstr = intent.getStringExtra("DESCRIPCION")
            val fotostr = intent.getStringExtra("FOTO")

            //establecer valores
            titulo.text = titulostr
            descripcion.text = descripcionstr
            Picasso.get().load(fotostr).into(fotopelicula);
        }
    }

    fun cerrar(view: View){
        finish()
    }
}