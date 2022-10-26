package com.example.myapplication

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry.getInstrumentation
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiObject
import androidx.test.uiautomator.UiObject2
import androidx.test.uiautomator.UiSelector
import androidx.test.uiautomator.Until.findObject

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import java.lang.Thread.*

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

        var settings = device.findObject(By.text("Settings"))
        Thread.sleep(500)
        settings.click()
        Thread.sleep(500)
        device.pressBack()
//        device.swipe(1033, 1346, 531, 1346, 20)
//        var tools: UiObject = device.findObject(
//            UiSelector().resourceIdMatches("com.huawei.android.launcher")
//        ).getChild(
//            (UiSelector().description("Tools"))
//        )
//        Thread.sleep(500)
//        tools.click()
    }

    @Test
    fun swipes() {
        //swipe right
        device.swipe(1033, 1346, 531, 1346, 20)

    }
}