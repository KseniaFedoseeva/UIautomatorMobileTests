package com.example.mobiletests.screens

import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiObject2

class WatchScreen : BaseScreen() {

    protected val root = By.pkg("com.android.deskclock")
    val alarm = By.textContains("Alarm")

    override fun rootElement(): UiObject2 {
        return device.findObject(root)
    }

    fun alarmElement(): UiObject2 {
        return rootElement().findObject(alarm)
    }


}