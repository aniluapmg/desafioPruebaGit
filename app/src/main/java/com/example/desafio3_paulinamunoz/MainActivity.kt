package com.example.desafio3_paulinamunoz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.desafio3_paulinamunoz.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        title = "Main Activity"



        //ejemplo para navegar entre activities
        binding.cardView1.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        binding.cardView2.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }

        binding.cardView3.setOnClickListener {
            startActivity(Intent(this, FourthActivity::class.java))
        }

        binding.cardView4.setOnClickListener {
            startActivity(Intent(this, FifthActivity::class.java))
        }

    }
}