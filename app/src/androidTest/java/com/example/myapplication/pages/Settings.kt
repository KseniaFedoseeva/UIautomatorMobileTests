package com.example.myapplication.pages

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.By
import androidx.test.uiautomator.BySelector
import androidx.test.uiautomator.UiDevice

object Settings {

    val settings = By.text("Settings")
}

object HomePage{
    val clock : BySelector = By.res("com.huawei.android.totemweather:id/widget_time_hour")
}

object Desks {
    val tools = By.desc("Folder Tools")
}

object Notification {
    val sound = By.desc("Sound")
    val silent = By.desc("Silent")
    val vibration = By.desc("Vibration")
}
