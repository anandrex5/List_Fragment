package com.company0ne.listfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //that's the way myListFragment gets added to my MainActivity
        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()

        //creating object of myListFragment
        val myListFragment = MyListFragment()

        fragmentTransaction.add(R.id.frame,myListFragment)
        fragmentTransaction.commit()
    }
}