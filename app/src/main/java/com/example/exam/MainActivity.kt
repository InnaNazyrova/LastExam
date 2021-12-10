package com.example.exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val LAST_SELECTED_ITEM="item"
private  val CAKE_FRAGMENT_ =CakeFragment().javaClass.name
private  val RECYCLER_FRAGMENT_ =RecyclerFragment().javaClass.name

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->

            var fragment: Fragment? = null
            when (item.itemId) {

                R.id.cakes -> {
                    fragment = if (savedInstanceState != null)
                        supportFragmentManager.getFragment(
                        savedInstanceState,
                        CAKE_FRAGMENT_
                    ) else CakeFragment()


                }

                R.id.prices -> {
                    fragment = if (savedInstanceState != null)
                        supportFragmentManager.getFragment(
                            savedInstanceState,
                            RECYCLER_FRAGMENT_
                        ) else RecyclerFragment()

                }

            }


            replaceFragment(fragment!!)

            true
        }
        bottomNavigationView.selectedItemId =savedInstanceState?.getInt(LAST_SELECTED_ITEM)?:
        R.id.cakes


    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(LAST_SELECTED_ITEM,bottomNavigationView.selectedItemId)

        val currentFragment=supportFragmentManager.fragments.last()
        supportFragmentManager.putFragment(
        outState,
            currentFragment.javaClass.name,currentFragment)



    }

        private fun replaceFragment(fragment: Fragment){
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()

        }





















    }
