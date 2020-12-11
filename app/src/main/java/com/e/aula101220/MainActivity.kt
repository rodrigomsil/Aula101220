package com.e.aula101220

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                Toast.makeText(this, "Alo Mundo", Toast.LENGTH_SHORT).show();
                true
            }
            R.id.action_cad ->{
                startActivity(Intent(this, MainActivity2::class.java))
                true
            }
            R.id.action_login ->{
                startActivity(Intent(this, MainActivity3::class.java))
                true
            }
            R.id.action_list ->{
                startActivity(Intent(this, MainActivity4::class.java))
                true
            }
            R.id.action_alt ->{
                startActivity(Intent(this, MainActivity5::class.java))
                true
            }
            R.id.action_exc ->{
                startActivity(Intent(this, MainActivity6::class.java))
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}