package com.example.instagram

import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.instagram.controller.My_Pageview_Addpter
import com.example.instagram.fragment.Home_Activity1


class MainActivity : AppCompatActivity() {

    lateinit var home_img: ImageView
    lateinit var search_img: ImageView
    lateinit var fragment_lay: FrameLayout
    lateinit var img_pageview: ViewPager

    var img = arrayOf(R.drawable.ic_baseline_home_24, R.drawable.ic_launcher_foreground,R.drawable.instagram,R.drawable.instagram1)


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        blinding()


        var adapter_view = My_Pageview_Addpter(this, img)
        img_pageview.adapter = adapter_view

        loadfragment(Home_Activity1())

        home_img.setOnClickListener {

            loadfragment(Home_Activity1())
        }
        search_img.setOnClickListener {

            loadfragment(BlankFragment())
        }


    }

    fun blinding() {

        home_img = findViewById<ImageView>(R.id.home_img)
        search_img = findViewById<ImageView>(R.id.search_img)
        fragment_lay = findViewById<FrameLayout>(R.id.fragment_lay)
        img_pageview = findViewById<ViewPager>(R.id.img_pageview)
    }

    fun loadfragment(fragment: Fragment) {

        var fragmentTransient = supportFragmentManager.beginTransaction()
        fragmentTransient.replace(R.id.fragment_lay, fragment)
        fragmentTransient.commit()

    }

}