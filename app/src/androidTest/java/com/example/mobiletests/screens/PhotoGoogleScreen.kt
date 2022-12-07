package com.example.mobiletests.screens

import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiObject2

class PhotoGoogleScreen : BaseScreen() {

    protected val root = By.res("com.google.android.apps.photos:id/toolbar_parent")
    protected val rootToolbar = By.res("com.google.android.apps.photos:id/toolbar")

    override fun rootElement(): UiObject2 {
        return device.findObject(root)
    }

    fun rootToolbar(): UiObject2 {
        return device.findObject(rootToolbar)
    }
}