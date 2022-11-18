package com.example.mobiletests.screens

import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiObject2

class WatchScreen : BaseScreen() {

    protected val root = By.pkg("com.android.deskclock")

    override fun rootElement(): UiObject2 {
        return device.findObject(root)
    }

    val alarm = By.textContains("Alarm")
}