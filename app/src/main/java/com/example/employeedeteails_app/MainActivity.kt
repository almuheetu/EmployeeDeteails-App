package com.example.employeedeteails_app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.employeedeteails_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



//        if (savedInstanceState == null) {
//            val fragment = EmployeeListFragment()
//            supportFragmentManager.beginTransaction()
//                .add(R.id.fragment_container, fragment)
//                .commit()
//        }
    }
}
