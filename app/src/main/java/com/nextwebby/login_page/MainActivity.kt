package com.nextwebby.login_page


import android.os.Bundle
import android.widget.Toast
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.nextwebby.login_page.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.activity = this

        binding.forgotPasswordText.setOnClickListener {
            Toast.makeText(this, "coming soon", Toast.LENGTH_SHORT).show()
        }
    }

    fun onLoginClick() {
        val username = binding.usernameInput.text.toString()
        val password = binding.passwordInput.text.toString()

        if (username == "admin" && password == "1234") {
            binding.resultText.text = "Login Successful!"
        } else {
            binding.resultText.text = "Invalid"
        }
    }

}
