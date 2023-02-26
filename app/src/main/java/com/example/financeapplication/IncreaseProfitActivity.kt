package com.example.financeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.financeapplication.databinding.ActivityIncreaseProfitBinding

class IncreaseProfitActivity : AppCompatActivity() {

    private val binding by lazy { ActivityIncreaseProfitBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            Intent(this@IncreaseProfitActivity, LoginActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnSkip.setOnClickListener {
            Intent(this@IncreaseProfitActivity, LoginActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}