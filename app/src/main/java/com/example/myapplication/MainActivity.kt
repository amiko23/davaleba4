package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myapplication.fragments.DashboardFragment
import com.example.myapplication.fragments.HistoryFragment
import com.example.myapplication.fragments.InfoFragment
import com.example.myapplication.fragments.SettingsFragment

class MainActivity : AppCompatActivity() {

    private val dashboardFragment = DashboardFragment()
    private val settingsFragment = SettingsFragment()
    private val infoFragment = InfoFragment()
    private val historyFragment = HistoryFragment()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(dashboardFragment)


    }

    private fun replaceFragment(fragment: Fragment){
        if (fragment !=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}