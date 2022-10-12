package com.example.job17_setya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tab = findViewById<TabLayout>(R.id.tabLayout2)
        var fragment : Fragment = to()

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()

        tab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab :TabLayout.Tab?) {
                when(tab!!.position) {
                    0 -> fragment = to()
                    1 -> fragment = tpfl()
                    2 -> fragment = pplg()
                    3 -> fragment = busana()
                    4 -> fragment = kuliner()

                }

                val ft = supportFragmentManager.beginTransaction()
                ft.replace(R.id.frameLayout, fragment)
                ft.commit()
            }


            override fun onTabUnselected(tab: TabLayout.Tab?) {


            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })
    }
}