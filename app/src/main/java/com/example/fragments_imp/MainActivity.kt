package com.example.fragments_imp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.fragments_imp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Observing Activity Lifecycle
        Log.i("Activity_Lifecycle", "onCreate")


        //First Fragment is shown in the main Activity
    }

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