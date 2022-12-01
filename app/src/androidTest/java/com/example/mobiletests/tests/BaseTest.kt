package com.example.mobiletests.tests

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import com.example.mobiletests.screens.*
import com.example.mobiletests.util.ButtonDevice
import org.junit.Assert
import org.junit.Before

abstract class BaseTest() {
   protected var device: UiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
    val appsScreen: AppsScreen by lazy { AppsScreen() }
    val settingsScreen: SettingsScreen by lazy { SettingsScreen() }
    val watchScreen: WatchScreen by lazy { WatchScreen() }
    val weatherScreen: WeatherScreen by lazy { WeatherScreen() }
    val homePageScreen: HomePageScreen by lazy { HomePageScreen() }

    @Before
    fun goHomePage() {

        do {
            ButtonDevice.pressHome()
        } while (!device.hasObject(HomePageScreen().clock))
        Assert.assertTrue("На экране нет часов", HomePageScreen().searchWigetWathc())
    }




}