package com.example.myapplication.pages

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import com.example.myapplication.BaseTest

open class Move  {

    val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

    fun rightSwipe() {
        device.swipe(1033, 1346, 531, 1346, 20)
    }

    fun leftSwipe() {
        device.swipe( 531, 1346, 1033, 1346,20)
    }
}