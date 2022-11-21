package com.example.mobiletests.screens

import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiObject2

class AppsScreen : BaseScreen() {

    protected val root = By.res("com.android.settings:id/main_content")
    protected val rootApp = By.res("com.android.settings:id/list")
    val weatherApp = By.text("Weather")
    val apps = By.text("Apps")

    override fun rootElement(): UiObject2 {
        return device.findObject(root)
    }

    fun rootElementApp(): UiObject2 {
        return device.findObject(rootApp)
    }

    fun apps(): UiObject2 {
        return rootElementApp().findObject(apps)
    }

    fun searchWeatherApp(): Boolean {
        return rootElement().hasObject(weatherApp)
    }

    fun weatherApp(): UiObject2 {
        return rootElement().findObject(weatherApp)
    }
}