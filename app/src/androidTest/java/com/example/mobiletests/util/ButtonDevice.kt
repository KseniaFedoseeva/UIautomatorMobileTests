package com.example.mobiletests.util

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice


object ButtonDevice {
    private val device : UiDevice
        get() = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

    fun pressHome(timeout: Long = 500){

        device.pressHome()
        Thread.sleep(timeout)

    }






}