package com.example.fragments_imp

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class fragdemo : AppCompatActivity() {
    lateinit var add: Button
    lateinit var remove1: Button
    lateinit var replace2: Button
    lateinit var hideFrag: Button
    lateinit var showFrag: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragdemo)
        Log.i("Activity_Lifecycle", "onCreate")

        //Initialising Fragments
        val firstfragment = Design1_Fragment()
        val secondfragment = Design2_Fragment()

        //Adding Id's
        add = findViewById(R.id.add)
        remove1 = findViewById(R.id.remove1)
        replace2 = findViewById(R.id.replace1)
        hideFrag = findViewById(R.id.hide)
        showFrag = findViewById(R.id.show)


        //Add Fragment

        add.setOnClickListener {

            supportFragmentManager.beginTransaction().apply {
                add(R.id.f1, firstfragment, "firstfragment")
//                addToBackStack("addFragment")
                commit()
            }
        }


        //Remove Fragment

        remove1.setOnClickListener {
            val removefrag = getSupportFragmentManager().findFragmentByTag("firstfragment");

            supportFragmentManager.beginTransaction().apply {
                if (removefrag != null) {
                    remove(firstfragment)
                    commit()
                }
                else {
                    Toast.makeText(this@fragdemo, "Add Fragment 1 first", Toast.LENGTH_LONG).show()
                }
            }
        }



        //Replace Fragment

        replace2.setOnClickListener {

            val replacefrag = getSupportFragmentManager().findFragmentByTag("firstfragment");

            supportFragmentManager.beginTransaction().apply {
                if (replacefrag != null) {
                 replace(R.id.f1,secondfragment,"secondfragment")
                    commit()
                }
                else {
                    Toast.makeText(this@fragdemo, "Add Fragment 1 first for replacing", Toast.LENGTH_LONG).show()
                }
            }
        }

     //Hide Fragment
        hideFrag.setOnClickListener {

            val Hidefrag = getSupportFragmentManager().findFragmentByTag("firstfragment");

            supportFragmentManager.beginTransaction().apply {
                if (Hidefrag != null) {
                    hide(firstfragment)
                    commit()
                }
                else {
                    Toast.makeText(this@fragdemo, "Add Fragment 1 first", Toast.LENGTH_LONG).show()
                }
            }

        }

        //Show Fragment
        showFrag.setOnClickListener {
            val Showfrag = getSupportFragmentManager().findFragmentByTag("firstfragment");

            supportFragmentManager.beginTransaction().apply {
                if (Showfrag!!.isHidden) {
                    show(firstfragment)
                    commit()
                }
                else {
                    Toast.makeText(this@fragdemo, "first click on hide", Toast.LENGTH_LONG).show()
                }
            }

        }




    }


    //Observing Activity LIfecycle


    override fun onStart() {
        super.onStart()
        // Observing Activity Lifecycle
        Log.i("Activity_Lifecycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        // Observing Activity Lifecycle
        Log.i("Activity_Lifecycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        // Observing Activity Lifecycle
        Log.i("Activity_Lifecycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        // Observing Activity Lifecycle
        Log.i("Activity_Lifecycle", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Activity_Lifecycle", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        // Observing Activity Lifecycle
        Log.i("Activity_Lifecycle", "onDestroy")
    }




}
