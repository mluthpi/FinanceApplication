package com.example.financeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.financeapplication.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy { ActivityLoginBinding.inflate(layoutInflater ) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val email = "admin"
        val password = "admin"

        binding.btnLogin.setOnClickListener {
            if (binding.edtEmail.text.toString()
                    .equals(email) && binding.edtPassword.text.toString().equals(password)
            ) {
                Intent(this@LoginActivity, MainActivity::class.java).also {
                    startActivity(it)
                }
            } else {
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
            }
        }
    }



    }