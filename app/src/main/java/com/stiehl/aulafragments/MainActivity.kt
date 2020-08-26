package com.stiehl.aulafragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.stiehl.aulafragments.fragments.GalleryFragment
import com.stiehl.aulafragments.fragments.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val galleryFragment = GalleryFragment()

        useFragment(homeFragment, false)

        btHome.setOnClickListener { useFragment(homeFragment) }
        btGallery.setOnClickListener { useFragment(galleryFragment) }
    }

    private fun useFragment(fragment: Fragment, addToBackStack: Boolean = true) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragContainer, fragment)
            if (addToBackStack)
                addToBackStack(null)
            commit()
        }
    }
}