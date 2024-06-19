package com.example.desafio3_paulinamunoz

import android.content.Intent
import android.os.Bundle
import com.example.desafio3_paulinamunoz.databinding.ActivityFourthBinding


class FourthActivity : BaseActivity<ActivityFourthBinding>() {

    override fun getViewBinding(): ActivityFourthBinding {
        return ActivityFourthBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding.buttonBackToMain.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}