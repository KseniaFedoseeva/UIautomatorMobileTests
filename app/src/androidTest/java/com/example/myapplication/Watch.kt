package com.example.myapplication

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import com.example.myapplication.pages.HomePage

class Watch : BaseMobile{

    private val device : UiDevice
        get() = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

    override fun clickWiget() {
        val watch = device.findObject(HomePage.clock)
        watch.click()
    }

}