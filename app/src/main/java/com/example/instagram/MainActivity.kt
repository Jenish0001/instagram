package com.example.instagram

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.instagram.fragment.Home_Activity1 as Home_Activity1


class MainActivity : AppCompatActivity() {

    lateinit var home_img: ImageView
    lateinit var search_img: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        blinding()


//        loadfragment(Home_Activity1())

        home_img.setOnClickListener {

            loadfragment(Home_Activity1())
        }
        search_img.setOnClickListener {

            loadfragment(BlankFragment())
        }


    }

    fun blinding() {

        var home_img = findViewById<ImageView>(R.id.home_img)
        var search_img = findViewById<ImageView>(R.id.search_img)

    }

    fun loadfragment(fragment: Fragment) {

        var fragmentTransient = supportFragmentManager.beginTransaction()
        fragmentTransient.replace(R.id.fragment_lay, fragment)
        fragmentTransient.commit()

    }

}