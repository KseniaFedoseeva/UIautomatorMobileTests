package com.example.myapplication

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.uiautomator.UiObject2
import com.example.myapplication.pages.Desks
import com.example.myapplication.pages.HomePage
import com.example.myapplication.pages.Move
import com.example.myapplication.pages.Settings
import org.junit.Assert

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
open class ExampleInstrumentedTest : BaseTest() {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.myapplication", appContext.packageName)
    }

    @Test
    fun openSettings() {

        var settings = device.findObject(Settings.settings)
        Thread.sleep(500)
        settings.click()
        Thread.sleep(500)
        Assert.assertTrue("Нет заголовка Settings", device.hasObject(Settings.settings))
        device.pressBack()
        Assert.assertTrue("На экране нет часов", device.hasObject(HomePage.clock))


        val tools: UiObject2 = device.findObject(Desks.tools)
        tools.click()



//        Thread.sleep(500)
//        tools.click()
    }

    @Test
    fun openTools() {

        while (!device.hasObject(Desks.tools)){
            Move().rightSwipe()

        }
        val tools: UiObject2 = device.findObject(Desks.tools)
        tools.click()

    }


}