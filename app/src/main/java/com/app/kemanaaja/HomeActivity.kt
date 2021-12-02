package com.app.kemanaaja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.app.kemanaaja.fragment.HomeFragment
import com.app.kemanaaja.fragment.UserFragment
import com.app.kemanaaja.fragment.WishFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val homeFragment = HomeFragment()
        val wishFragment = WishFragment()
        val userFragment = UserFragment()

        makeCurrentFragment(homeFragment)

        val buttom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        buttom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_home -> makeCurrentFragment(homeFragment)
                R.id.menu_wish-> makeCurrentFragment(wishFragment)
                R.id.menu_user -> makeCurrentFragment(userFragment)
            }

            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fram_nav, fragment)
            commit()
        }
    }
}