package com.example.desafio3_paulinamunoz

import android.content.Intent
import android.os.Bundle
import com.example.desafio3_paulinamunoz.BaseActivity
import com.example.desafio3_paulinamunoz.MainActivity
import com.example.desafio3_paulinamunoz.databinding.ActivityFifthBinding



class FifthActivity : BaseActivity<ActivityFifthBinding>() {

    override fun getViewBinding(): ActivityFifthBinding {
        return ActivityFifthBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding.buttonBackToMain.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}