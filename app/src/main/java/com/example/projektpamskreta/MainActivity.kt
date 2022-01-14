package com.example.projektpamskreta


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title= "KotlinApp"
        val button:Button =findViewById(R.id.openNauczyciel)
        button.setOnClickListener{
            val intent = Intent(this@MainActivity , nauczyciele::class.java )
            startActivity(intent)
        }
    }
}