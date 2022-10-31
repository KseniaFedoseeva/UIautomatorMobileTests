package com.example.myapplication

import androidx.appcompat.widget.AppCompatDrawableManager.get
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.SearchCondition
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiObject2


object ButtonDevice {
    private val device : UiDevice
        get() = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

    fun pressHome(timeout: Long = 500){

        device.pressHome()
        Thread.sleep(timeout)

    }

    fun clickAndWait (search : SearchCondition<UiObject2>) {

    }




}