package com.example.mobiletests.tests

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import com.example.mobiletests.ButtonDevice
import com.example.mobiletests.pages.HomePage
import org.junit.Assert
import org.junit.Before

abstract class BaseTest() {
   protected var device: UiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

    @Before
    fun goHomePage() {

        do {
            ButtonDevice.pressHome()
        } while (!device.hasObject(HomePage.clock))
        Assert.assertTrue("На экране нет часов", device.hasObject(HomePage.clock))
    }


}