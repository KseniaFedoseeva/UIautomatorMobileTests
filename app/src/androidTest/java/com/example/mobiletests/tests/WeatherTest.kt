package com.example.mobiletests.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.uiautomator.Until
import com.example.mobiletests.screens.HomePageScreen
import com.example.mobiletests.screens.WatchScreen
import com.example.mobiletests.screens.WeatherScreen
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class WeatherTest : BaseTest() {

    @Test
    fun openWeather() {
        homePageScreen.wigetWeather().clickAndWait(Until.newWindow(), 1000)
        Assert.assertTrue("Не открыта погода", weatherScreen.rootElement().hasObject(weatherScreen.updateWeather))

    }
}