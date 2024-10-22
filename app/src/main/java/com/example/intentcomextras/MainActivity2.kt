package com.example.intentcomextras

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.intentcomextras.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    private var name = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var i = intent

        binding.buttonChangeName.setOnClickListener {
            i = Intent(this, MainActivity::class.java)
            i.putExtra("name", this.name)
            finish()
        }

        val newName = i.extras?.getString("name")
        if (newName != null && newName != "") {
            this.name = newName
            binding.textName.setText("Olá ${this.name}")
        } else {
            Toast.makeText(applicationContext, "Name not inserted", Toast.LENGTH_SHORT).show()
        }
    }
}