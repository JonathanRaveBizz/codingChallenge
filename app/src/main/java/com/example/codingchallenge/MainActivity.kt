package com.example.codingchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.codingchallenge.R
import com.example.codingchallenge.databinding.ActivityMainBinding
import com.example.codingchallenge.databinding.RecordListFragmentBinding
import com.example.codingchallenge.fragments.RecordListFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().apply{
            add(R.id.records_list_fragment, RecordListFragment())
                .setReorderingAllowed(true)
                .commit()//we think we need this
        }

    }
}