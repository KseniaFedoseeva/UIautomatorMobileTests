package com.example.myapplication

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import com.example.myapplication.pages.HomePage
import org.junit.Assert
import org.junit.Before

abstract class BaseTest () {
    lateinit var device: UiDevice



    @Before
    fun goHomePage() {
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        do{
            ButtonDevice.pressHome()
        }
        while(!device.hasObject(HomePage.clock))
        Assert.assertTrue("На экране нет часов", device.hasObject(HomePage.clock))
    }


}