package com.company0ne.listfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.FragmentManager


class SecondFragment : Fragment() {

    lateinit var imageView: ImageView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //first we create an object from the ViewClass
        // and then we assign the fragment designed to this view object

        val view: View =inflater.inflate(R.layout.fragment_second, container, false)

        imageView = view.findViewById(R.id.imageView)

        //now we have got to get the position value that i sent from the secondActivity
        val position = arguments?.getInt("position",0)
        when(position)
        {
            0 -> imageView.setImageResource(R.drawable.india)
            1 -> imageView.setImageResource(R.drawable.argentina)
            2 -> imageView.setImageResource(R.drawable.brazil)
            3 -> imageView.setImageResource(R.drawable.japan)
            4 -> imageView.setImageResource(R.drawable.turky)
        }


        // Inflate the layout for this fragment
        return view


    }
}