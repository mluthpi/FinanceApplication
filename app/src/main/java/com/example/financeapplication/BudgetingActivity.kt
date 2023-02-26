package com.example.financeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.financeapplication.databinding.ActivityBudgetingBinding

class BudgetingActivity : AppCompatActivity() {

    private val binding by lazy { ActivityBudgetingBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            Intent(this@BudgetingActivity, IncreaseProfitActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnSkip.setOnClickListener {
            Intent(this@BudgetingActivity, LoginActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}