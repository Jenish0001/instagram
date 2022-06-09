package com.example.instagram.controller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.example.instagram.MainActivity
import com.example.instagram.R

class My_Pageview_Addpter(val mainActivity: MainActivity, val img: Array<Int>) : PagerAdapter() {
    override fun getCount(): Int {

        return img.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {

        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var view =
            LayoutInflater.from(mainActivity).inflate(R.layout.viewpager_item, container, false)
        var img_view_page = view.findViewById<ImageView>(R.id.img_view_page)
        img_view_page.setImageResource(img[position])
        container.addView(view)

        return view


    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)

    }
}