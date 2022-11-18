package com.example.mobiletests

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.uiautomator.*
import com.example.mobiletests.pages.*
import com.example.mobiletests.tests.BaseTest
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
   }

    @Test
    fun openTools() {

        while (!device.hasObject(Desks.tools)){
            Move().rightSwipe()


        }
        //if
//        while (!device.hasObject(Desks.tools)){
//            Move().leftSwipe()
//        }

        val tools: UiObject2 = device.findObject(Desks.tools)
        tools.click()

    }


    @Test
    fun turnOffSound() {
        device.openNotification()
        device.wait(Until.findObject(Notification.sound), 500)
        val sound: UiObject2 = device.findObject(Notification.sound)
        sound.click()
        sound.wait(Until.findObject(Notification.vibration), 500)
        val vibration : UiObject2 = device.findObject(Notification.vibration)
        vibration.click()
        vibration.wait(Until.findObject(Notification.silent), 500)
        val silent : UiObject2 = device.findObject(Notification.silent)
        Assert.assertTrue("Не отключен звук", device.hasObject(Notification.silent))
        silent.click()
        }

    @Test
    fun open_Watch() {
        Watch().clickWiget()
        Assert.assertTrue("Часы не открылись", device.hasObject(WacthWiget.alarm))
    }

    @Test
    fun openWeather() {
        Weather().clickWiget()
        Assert.assertTrue("Виджет погоды не открылся", device.hasObject(WeatherWiget.updateWeather))
    }

    @Test
    fun searchWeatherInApp() {
        device.openNotification()
        device.findObject(Settings.settingsButton).click()
        Thread.sleep(1000)
        device.findObject(Settings.apps).click()
        Thread.sleep(1000)
        device.findObject(By.res("android:id/title")).findObject(Settings.apps).click()
        Thread.sleep(500)
        while (!device.hasObject(Settings.weatherApp)) {
            val listApp = UiSelector().resourceId("android:id/list")
            UiScrollable(listApp).scrollForward()
        }
        device.findObject(Settings.weatherApp).click()
    }
    }

