package com.example.fragments_imp

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


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

            requireActivity().supportFragmentManager.beginTransaction().apply {
                add(R.id.frameLayout,Design1_Fragment(),"FIRST_FRAGMENT")
                addToBackStack("none")
                commit()
            }
    }

//Added Listener to Second Button
    secondAdd  =view.findViewById(R.id.btnfragment2)
    secondAdd.setOnClickListener {

        requireActivity().supportFragmentManager.beginTransaction().apply {
            add(R.id.frameLayout,Design2_Fragment(),"SECOND_FRAGMENT")
            addToBackStack("none")
            commit()
        }

    }
        return view
    }


}