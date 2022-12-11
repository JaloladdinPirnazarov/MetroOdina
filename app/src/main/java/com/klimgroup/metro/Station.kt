package com.klimgroup.metro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.klimgroup.metro.databinding.ActivityStationBinding

class Station : AppCompatActivity() {
    private lateinit var binding: ActivityStationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setActivity()
        binding.btnBack.setOnClickListener { finish() }
    }

    private fun setActivity(){
        val id = intent.getIntExtra("stationId",0)
        val img = when(id){
            0 -> R.drawable.uzb_line
            1 -> R.drawable.yunusobod
            2 -> R.drawable.chilonzor_line
            else -> R.drawable.sirgali_line
        }
        binding.apply {
            tvStationName.text = resources.getStringArray(R.array.StationName)[id]
            tvDesc.text = resources.getStringArray(R.array.StationDescriptions)[id]
            imgStation.setImageResource(img)
        }
    }
}