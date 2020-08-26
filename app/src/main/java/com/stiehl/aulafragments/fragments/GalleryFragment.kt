package com.stiehl.aulafragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.stiehl.aulafragments.R
import kotlinx.android.synthetic.main.fragment_gallery.view.*

class GalleryFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_gallery, container, false)

        view.imAndroid.setOnClickListener { openImage(R.drawable.android) }
        view.imIfpr.setOnClickListener { openImage(R.drawable.ifpr) }

        return view
    }

    private fun openImage(imageId: Int) {
        val bundle = Bundle()
        bundle.putInt("imageId", imageId)
        findNavController().navigate(R.id.navigateToShowImage, bundle)
    }
}