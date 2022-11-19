package com.example.mobiletests.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
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
        HomePageScreen().wigetWeather().click()
        Thread.sleep(2000)
        Assert.assertTrue("Не открыта погода", WeatherScreen().rootElement().hasObject(WeatherScreen().updateWeather))

    }
}