package com.example.myapplication

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import org.junit.Before

abstract class BaseTest () {
    lateinit var device: UiDevice


    @Before
    fun goHomePage() {
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        ButtonDevice.pressHome()
    }


}