package com.stiehl.aulafragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stiehl.aulafragments.R
import kotlinx.android.synthetic.main.fragment_show_image.view.*

class ShowImageFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_show_image, container, false)

        val imageId = arguments?.getInt("imageId")
        view.imShowImage.setImageResource(imageId!!)

        return view
    }

}