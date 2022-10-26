package com.example.myapplication

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.By
import androidx.test.uiautomator.BySelector
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiObject
import org.junit.Before

abstract class BaseTest () {
    lateinit var device: UiDevice
    val clock : BySelector = By.res("com.huawei.android.totemweather:id/widget_time_hour")


    @Before
    fun goHomePage() {
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        do{
            ButtonDevice.pressHome()
        }
        while(!device.hasObject(clock))
    }


}