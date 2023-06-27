package com.company0ne.listfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //here we get these values from MyListFragment class
        val position = intent.getIntExtra("position",0)
        //now send this value to SecondFragment

        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()

        val secondFragment = SecondFragment()

        //create an Object from the bundle class.
        val bundle = Bundle()
        bundle.putInt("position",position)
        secondFragment.arguments = bundle

        fragmentTransaction.add(R.id.frameLayout,secondFragment)
        fragmentTransaction.commit()
    }
}