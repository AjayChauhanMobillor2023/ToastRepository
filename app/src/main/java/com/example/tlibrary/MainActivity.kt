package com.example.tlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tlibrary.databinding.ActivityMainBinding
import com.example.toasterslibrary.Toast

class MainActivity : AppCompatActivity() {

        lateinit var binding : ActivityMainBinding

        override fun onCreate(savedInstanceState : Bundle?) {
                super.onCreate(savedInstanceState)

                binding = ActivityMainBinding.inflate(layoutInflater)
                setContentView(binding.root)

                binding.btn.setOnClickListener {

                        Toast.Toast(this@MainActivity,"hello")

                }

        }
}