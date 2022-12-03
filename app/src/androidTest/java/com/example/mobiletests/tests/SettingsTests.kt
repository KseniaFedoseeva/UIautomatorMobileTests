package com.example.mobiletests.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiObject2
import androidx.test.uiautomator.UiScrollable
import androidx.test.uiautomator.UiSelector
import androidx.test.uiautomator.Until
import com.example.mobiletests.screens.AppsScreen
import com.example.mobiletests.screens.HomePageScreen
import com.example.mobiletests.screens.SettingsScreen
import io.qameta.allure.Allure
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SettingsTests : BaseTest() {

    @Test
    fun searchWeatherInApp() {

            homePageScreen.openNotification()
            settingsScreen.settingsButton().clickAndWait(Until.newWindow(), 2000)
            settingsScreen.searchAppsInSettings().clickAndWait(Until.newWindow(), 2000)
            appsScreen.apps().click()
            appsScreen.waitAllApps()
            while (!appsScreen.searchWeatherApp()) {
                val listApp = UiSelector().resourceId("android:id/list")
                UiScrollable(listApp).scrollForward()
            }

            appsScreen.weatherApp().click()


        }


}