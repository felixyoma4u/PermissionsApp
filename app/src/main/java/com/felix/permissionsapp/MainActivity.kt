package com.felix.permissionsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.felix.permissionsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var nameOfUser = "Papa John"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.LaunchGallary.setOnClickListener {
            nameOfUser = binding.nameInput.text.toString()
            setName(nameOfUser)
        }

    }

    private fun openGallary(){
        val intent = Intent(Intent.ACTION_PICK)
        startActivity(intent)

    }

    private fun setName(name: String){
        binding.textView.text = name

    }
}