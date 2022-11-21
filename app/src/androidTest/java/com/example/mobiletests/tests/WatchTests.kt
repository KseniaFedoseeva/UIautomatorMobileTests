package com.example.mobiletests.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.mobiletests.screens.HomePageScreen
import com.example.mobiletests.screens.WatchScreen
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class WatchTests : BaseTest() {
    @Test
    fun openWatch() {
        HomePageScreen().wigetWatch().click()
        Thread.sleep(1000)
        Assert.assertTrue("Не открыты часы", WatchScreen().rootElement().hasObject(WatchScreen().alarm))

    }
}