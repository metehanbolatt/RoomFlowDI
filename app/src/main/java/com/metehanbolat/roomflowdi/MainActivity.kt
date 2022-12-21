package com.metehanbolat.roomflowdi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.metehanbolat.roomflowdi.database.User
import com.metehanbolat.roomflowdi.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            viewModel.addUser(
                User(
                    id = 99,
                    name = "Metehan"
                )
            )
        }

        viewModel.getAllUser().observe(this) {
            println("Observe All User: $it")
        }


    }
}