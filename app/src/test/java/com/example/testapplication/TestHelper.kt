package com.example.testapplication

import androidx.fragment.app.Fragment
import org.robolectric.Robolectric

object TestHelper {

    private val testMainActivity: MainActivity =
        Robolectric.buildActivity(MainActivity::class.java).setup().get()

    fun startFragmentInMainContentFrame(fragment: Fragment) {
        testMainActivity.supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow()
    }
}
