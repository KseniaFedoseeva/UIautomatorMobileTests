package com.example.mobiletests.screens

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiObject2
import com.example.mobiletests.util.DeviceUtil

abstract class BaseScreen {
    protected val device: UiDevice = DeviceUtil.device

    abstract fun rootElement() : UiObject2

}