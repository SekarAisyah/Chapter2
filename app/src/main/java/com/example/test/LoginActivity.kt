package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.test.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("lifeactivity", "onCretar Activ")

        //KIRIM DATA WITH BUNDLE
        binding.buttonLogin.setOnClickListener{
            // ambil data dari inputan user
            val namestudent = binding.editText1.text.toString()
            var bundle = Bundle()
            var pindah = Intent(this, MainActivity::class.java)
            bundle.putString("nama", namestudent)
            bundle.putInt("umur", 21)
            pindah.putExtras(bundle)
            startActivity(pindah)
        }

        binding.buttonSerializable.setOnClickListener{
            val dataStudent = StudentAndroid("KAI", "J3C119113", "sekarrisma@apps.ipb.ac.id")
            val move = Intent(this, MainActivity::class.java)
            move.putExtra("DATASTUDENT", dataStudent)
            startActivity(move)
        }


    }



    override fun onResume() {
        super.onResume()
        Log.d("lifeactivity", "onResume Activ")

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