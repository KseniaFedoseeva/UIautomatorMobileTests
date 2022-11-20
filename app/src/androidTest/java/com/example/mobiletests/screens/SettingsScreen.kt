package com.example.mobiletests.screens

import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiObject2

class SettingsScreen : BaseScreen() {

    protected val root = By.res("com.android.systemui:id/quick_settings_container")
    protected val rootSettings = By.res("com.android.settings:id/content_parent")
    val settingsButton = By.res("com.android.systemui:id/settings_button")

    val apps = By.text("Apps")
    val sound = By.desc("Sound")
    val silent = By.desc("Silent")
    val vibration = By.desc("Vibration")



    override fun rootElement(): UiObject2 {
        return device.findObject(root)
    }

    fun rootSettingsElement(): UiObject2 {
        return device.findObject(rootSettings)
    }

    fun settingsButton(): UiObject2 {
        return rootElement().findObject(settingsButton)
    }

    fun searchAppsInSettings(): UiObject2 {
        return rootSettingsElement().findObject(apps)
    }
}