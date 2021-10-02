package com.example.fragments_imp

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceActivity
import android.widget.Button
import androidx.fragment.app.DialogFragment
import com.example.fragments_imp.MainActivity

class Initial_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_initial)

        // Get views reference
        val fragCycleBtn = findViewById<Button>(R.id.fraglifeBtn)
        val dialogFragmentBtn = findViewById<Button>(R.id.dFragmentBtn)
        val preferenceFragmentBtn = findViewById<Button>(R.id.pFragmentbtn)
        val demofrag1 = findViewById<Button>(R.id.demoFragmentbtn)

       //Fragment Cycle Listener
        fragCycleBtn.setOnClickListener {
            // send user to mainActivity activity
            startActivity(Intent(this, MainActivity::class.java))
        }

        //Dialog Listener
        dialogFragmentBtn.setOnClickListener {

            // Get fragment manager support
            val fragmentManager = supportFragmentManager
            // create object of class
            val dialogFragmentDemoObj = DialogFragmentDemo()
            // show dialog fragment
            dialogFragmentDemoObj.show(fragmentManager, "Dialog Fragment")

        }

        // Preference listener
        preferenceFragmentBtn.setOnClickListener {
            startActivity(Intent(this, preference_Activity::class.java))
        }

        //Demo Fragment Listener

        demofrag1.setOnClickListener {
            startActivity(Intent(this, fragdemo::class.java))

        }

    }
}




// Creating Diaglog Fragment
class DialogFragmentDemo : DialogFragment() {

    // It return Dialog after building it
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        AlertDialog.Builder(requireContext())
            .setTitle("Welcome")
            .setMessage("This is a Dialog Fragment")
            .setPositiveButton("Okay!") { _, _ -> }
            .setNegativeButton("Cancel"){ _, _ -> }
            .create()
}