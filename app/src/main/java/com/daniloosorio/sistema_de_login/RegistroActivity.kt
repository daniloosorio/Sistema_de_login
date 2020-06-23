package com.daniloosorio.sistema_de_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_registro.*

class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        button5.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_overflow, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_1) {
            Log.d("menu", "presionado el menu1")
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        } else {
            val intent = Intent(this,SplashActivity::class.java)
            startActivity(intent)
            Log.d("menu", "presionado el menu1")
        }
        return super.onOptionsItemSelected(item)
    }
}