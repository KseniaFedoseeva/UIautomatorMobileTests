package com.example.mobiletests

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import com.example.mobiletests.pages.HomePage
import com.example.mobiletests.screens.BaseMobile

class Weather : BaseMobile {

    private val device : UiDevice
        get() = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

    override fun clickWiget() {
        val weather = device.findObject(HomePage.weather)
        weather.click()
        Thread.sleep(1500)
        if(device.hasObject(HomePage.weather)){
            throw RuntimeException("Виджет не открылся")
        }
    }
}