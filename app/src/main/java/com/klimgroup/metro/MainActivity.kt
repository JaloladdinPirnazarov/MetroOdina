package com.klimgroup.metro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.klimgroup.metro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onClickListeners()
    }

    private fun onClickListeners(){
        binding.apply {
            btnStation1.setOnClickListener { openStation(0) }
            btnStation2.setOnClickListener { openStation(1) }
            btnStation3.setOnClickListener { openStation(2) }
            btnStation4.setOnClickListener { openStation(3) }
            btnExit.setOnClickListener { finish() }
        }
    }

    private fun openStation(id:Int){
        val i = Intent(this,Station::class.java).putExtra("stationId",id)
        startActivity(i)
    }
}