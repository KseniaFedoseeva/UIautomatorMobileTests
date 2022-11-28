package com.example.mobiletests.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.uiautomator.UiScrollable
import androidx.test.uiautomator.UiSelector
import com.example.mobiletests.screens.AppsScreen
import com.example.mobiletests.screens.HomePageScreen
import com.example.mobiletests.screens.SettingsScreen
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SettingsTests : BaseTest() {

    @Test
    fun searchWeatherInApp() {
        homePageScreen.openNotification()
        settingsScreen.settingsButton().click()
        Thread.sleep(1000)
        settingsScreen.searchAppsInSettings().click()
        Thread.sleep(1000)
        appsScreen.apps().click()



        Thread.sleep(1000)

        while (!appsScreen.searchWeatherApp()){
            val listApp = UiSelector().resourceId("android:id/list")
            UiScrollable(listApp).scrollForward()
        }

        appsScreen.weatherApp().click()


    }

}