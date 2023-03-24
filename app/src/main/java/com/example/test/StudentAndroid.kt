package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

data class StudentAndroid(
    val name: String,
    val nim : String,
    val email : String
): java.io.Serializable
