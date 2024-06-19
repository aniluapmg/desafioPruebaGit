package com.example.desafio3_paulinamunoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.desafio3_paulinamunoz.databinding.ActivityThirdBinding

class ThirdActivity : BaseActivity<ActivityThirdBinding>() {

    override fun getViewBinding(): ActivityThirdBinding {
        return ActivityThirdBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding.buttonBackToMain.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}