package com.example.mobiletests

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import com.example.mobiletests.pages.HomePage
import com.example.mobiletests.screens.BaseMobile

class Watch : BaseMobile {

    private val device : UiDevice
        get() = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

    override fun clickWiget() {
        val watch = device.findObject(HomePage.clock)
        watch.click()
        Thread.sleep(1000)
        if(device.hasObject(HomePage.clock)){
            throw RuntimeException("Виджет не открылся")
        }
    }

}