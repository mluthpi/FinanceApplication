package com.example.financeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.financeapplication.databinding.ActivityAutoSavingBinding

class AutoSavingActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAutoSavingBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            Intent(this@AutoSavingActivity, BudgetingActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.btnSkip.setOnClickListener {
            Intent(this@AutoSavingActivity, LoginActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}