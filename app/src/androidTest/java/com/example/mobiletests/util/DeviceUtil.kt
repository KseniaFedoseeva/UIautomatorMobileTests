package com.example.mobiletests.util

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice

object DeviceUtil {
    val device : UiDevice
    get() = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
}