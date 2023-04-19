package com.example.assignment21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.options, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.colors -> {
                val fragment = ColorsFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.MainFragment, fragment)
                    .commit()
                true
            }
            R.id.alphabets -> {
                val fragment = AlphabetFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.MainFragment, fragment)
                    .commit()
                true
            }
            R.id.shapes -> {
                val fragment = ShapesFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.MainFragment, fragment)
                    .commit()
                true
            }
            R.id.animals -> {
                val fragment = AnimalsFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.MainFragment, fragment)
                    .commit()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
