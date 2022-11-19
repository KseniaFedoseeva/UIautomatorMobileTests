package com.example.mobiletests.screens

import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiObject2

class WeatherScreen : BaseScreen() {

    protected val root = By.res("android:id/decor_content_parent")
    val updateWeather = By.textContains("Last updated")


    override fun rootElement(): UiObject2 {
        return device.findObject(root)
    }
}