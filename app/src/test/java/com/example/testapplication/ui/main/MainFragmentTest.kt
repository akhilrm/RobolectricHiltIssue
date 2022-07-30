package com.example.testapplication.ui.main

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.testapplication.TestHelper
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.HiltTestApplication
import org.junit.After
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.kotlin.spy
import org.robolectric.annotation.Config

@HiltAndroidTest
@Config(application = HiltTestApplication::class, manifest = Config.NONE)
@RunWith(AndroidJUnit4::class)
class MainFragmentTest {

    private var fragment: MainFragment? = null

    @get:Rule(order = 0)
    val hiltRule = HiltAndroidRule(this)

    @Before
    fun setUp() {
        fragment = spy()
        TestHelper.startFragmentInMainContentFrame(fragment!!)
    }

    @Test
    fun testMainFragment() {
        assertNotNull(fragment)
        assertTrue(fragment!!.isVisible)
    }

    @Test
    fun testMainFragment_1() {
        assertNotNull(fragment)
        assertTrue(fragment!!.isVisible)
    }

    @Test
    fun testMainFragment_2() {
        assertNotNull(fragment)
        assertTrue(fragment!!.isVisible)
    }

    @After
    fun tearDown() {
        fragment = null
    }
}
