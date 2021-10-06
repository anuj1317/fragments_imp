package com.example.fragments_imp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class landscapeViewFragment : Fragment() {

    lateinit var firstdesignAdd: Button
    lateinit var seconddesignAdd: Button
    lateinit var thirddesignAdd: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_landscape_view, container, false)

        //Landscape first button Listener
        firstdesignAdd = view.findViewById(R.id.addFirstFragmentBtn)
        firstdesignAdd.setOnClickListener {
            val fragmentManager = fragmentManager
            val fragmentTransaction = fragmentManager!!.beginTransaction()

            // add the Fragment to existing container
            fragmentTransaction.add(R.id.frameLayoutlandscape,Design1_Fragment(), "FIRST_FRAGMENT")
            fragmentTransaction.addToBackStack("none")
            fragmentTransaction.commit()
    }

        //Landscape Second button Listener
       seconddesignAdd  =view.findViewById(R.id.addSecondFragmentBtn)
        seconddesignAdd.setOnClickListener {
            val fragmentManager = fragmentManager
            val fragmentTransaction = fragmentManager!!.beginTransaction()

            // add the Fragment to existing container
            fragmentTransaction.add(R.id.frameLayoutlandscape, Design2_Fragment(), "SECOND_FRAGMENT")
            fragmentTransaction.addToBackStack("none")
            fragmentTransaction.commit()

    }

        //Landscape third button Listener
    thirddesignAdd  =view.findViewById(R.id.addThirdFragmentBtn)
    thirddesignAdd.setOnClickListener {

        val fragmentManager = fragmentManager
        val fragmentTransaction = fragmentManager!!.beginTransaction()

            // add the Fragment to existing container
            fragmentTransaction.add(R.id.frameLayoutlandscape, Design3_Fragment(), "THIRD_FRAGMENT")
        fragmentTransaction.addToBackStack("none")
        fragmentTransaction.commit()

    }
    return  view
    }


}