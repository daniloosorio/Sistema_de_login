package com.daniloosorio.sistema_de_login

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
/*
class SplashActivity :AppCompatActivity(){
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
    setContentView(R.layout.activity_splash)

    val time= Timer()
    time.shedule(time.task{goToMainActivity},1000)
}
    private fun goToMainActivity(){
        val intent= intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}*/
///app:fontFamily="sans-serif-condensed"