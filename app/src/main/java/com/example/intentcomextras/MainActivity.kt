package com.example.intentcomextras

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intentcomextras.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var i = intent

        binding.editName.setText(i.extras?.getString("name"))

        binding.buttonApply.setOnClickListener {
            i = Intent(this, MainActivity2::class.java)
            i.putExtra("name", binding.editName.text.toString())
            startActivity(i)
        }
    }
}