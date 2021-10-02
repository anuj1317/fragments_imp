package com.example.fragments_imp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class preference_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preference)

        // Add PreferenceFragment in activity
        supportFragmentManager
            .beginTransaction()
            .add(R.id.preferenceFragmentContainer, MySettingsFragment())
            .commit()
    }
}

//Setting Fragment Class for Preference Fragment
class MySettingsFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preference, rootKey)
    }
}