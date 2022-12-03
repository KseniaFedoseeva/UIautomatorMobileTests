package com.example.mobiletests.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.uiautomator.Until
import com.example.mobiletests.screens.HomePageScreen
import com.example.mobiletests.screens.WatchScreen
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class WatchTests : BaseTest() {
    @Test
    fun openWatch() {
        homePageScreen.wigetWatch().clickAndWait(Until.newWindow(), 1000)
        Assert.assertTrue("Не открыты часы", watchScreen.rootElement().hasObject(watchScreen.alarm))

    }
}