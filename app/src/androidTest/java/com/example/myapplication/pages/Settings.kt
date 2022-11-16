package com.example.myapplication.pages

import androidx.test.uiautomator.By
import androidx.test.uiautomator.BySelector

object Settings {

    val settings = By.text("Settings")
    val settingsButton = By.res("com.android.systemui:id/settings_button")
    val app = By.pkg("com.android.settings")
    val apps = By.text("Apps")
    val weatherApp = By.text("Weather")
    val listOfApps = By.res("android:id/list")

}

object Notification {
    val sound = By.desc("Sound")
    val silent = By.desc("Silent")
    val vibration = By.desc("Vibration")
}





