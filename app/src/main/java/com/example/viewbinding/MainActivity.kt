package com.example.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.viewbinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



         binding.btnSend.setOnClickListener {
            val data = edit_text.text
            savedata(data.toString())
        }
    }

    private fun savedata(data: String){
        binding.textView.text = data
    }
}