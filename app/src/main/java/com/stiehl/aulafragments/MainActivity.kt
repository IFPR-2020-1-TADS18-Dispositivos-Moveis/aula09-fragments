package com.stiehl.aulafragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.stiehl.aulafragments.fragments.GalleryFragment
import com.stiehl.aulafragments.fragments.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView.setupWithNavController(findNavController(R.id.navHostFragment))
    }
}