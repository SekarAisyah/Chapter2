package com.example.test

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("lifeactivity", "onCreate Activ")

        binding.buttonMain.setOnClickListener{
            val move = Intent(Intent.ACTION_VIEW)
            move.data = Uri.parse("https://ul.waze.com/ul?place=ChIJ7dNbqO_FaS4RfDLYaPb6U0M&ll=-6.58999220%2C106.80948260&navigate=yes&utm_campaign=default&utm_source=waze_website&utm_medium=lm_share_location")
            startActivity(move)
        }

        //AMBIL DATA NAMA
        val getbundle = intent.extras
        val name = getbundle?.getString("nama") //kai
        val age = getbundle?.getInt("umur")
        binding.txtSecond.text = "Haloo, " + name + " Umur  : $age" + "Tahun"


    }

    override fun onResume() {
        super.onResume()
        Log.d("lifeactivity", "onResume Activ")

        binding.txtSecond
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("lifeactivity", "onRestart Activ")
    }
    override fun onPause() {
        super.onPause()
        Log.d("lifeactivity", "onPause Activ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("lifeactivity", "onStop Activ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifeactivity", "onDestroy Activ")
    }

}