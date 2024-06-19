package com.example.desafio3_paulinamunoz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.desafio3_paulinamunoz.databinding.ActivitySecondBinding

class SecondActivity : BaseActivity<ActivitySecondBinding>() {

    override fun getViewBinding(): ActivitySecondBinding {
        return ActivitySecondBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding.buttonBackToMain.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}