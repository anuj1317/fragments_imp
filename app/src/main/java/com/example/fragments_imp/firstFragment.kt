package com.example.fragments_imp

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class firstFragment : Fragment() {

    lateinit var firstAdd: Button
    lateinit var secondAdd: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // 2 Buttons View
        val view = inflater.inflate(R.layout.fragment_first, container, false)

      //Added listener to first button
        firstAdd = view.findViewById(R.id.btnfragment1)
        firstAdd.setOnClickListener {
            val fragmentManager = fragmentManager

            // create a FragmentTransaction to begin the transaction and add the Fragment
            val fragmentTransaction = fragmentManager!!.beginTransaction()

            // add the Fragment to existing container
            fragmentTransaction.add(R.id.frameLayout,Design1_Fragment(), "FIRST_FRAGMENT")
            fragmentTransaction.addToBackStack("none")
            fragmentTransaction.commit()
    }

//Added Listener to Second Button
    secondAdd  =view.findViewById(R.id.btnfragment2)
    secondAdd.setOnClickListener {
            val fragmentManager = fragmentManager

            // create a FragmentTransaction to begin the transaction and add the Fragment
            val fragmentTransaction = fragmentManager!!.beginTransaction()

            // add the Fragment to existing container
            fragmentTransaction.add(R.id.frameLayout, Design2_Fragment(), "SECOND_FRAGMENT")
        fragmentTransaction.addToBackStack("none")
        fragmentTransaction.commit()

    }
        return view
    }


}