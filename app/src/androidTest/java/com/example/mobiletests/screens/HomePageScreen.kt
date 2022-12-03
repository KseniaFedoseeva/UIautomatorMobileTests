package com.example.mobiletests.screens

import androidx.test.uiautomator.By
import androidx.test.uiautomator.BySelector
import androidx.test.uiautomator.UiObject2


open class HomePageScreen: BaseScreen() {

    protected val root = By.clazz("android.view.ViewGroup")
    val search = By.desc("Chrome search")
    val tools = By.desc("Folder Tools")
    val clock : BySelector = By.res("com.huawei.android.totemweather:id/widget_time_hour")
    val weather: BySelector = By.res("com.huawei.android.totemweather:id/widget_highlow_temperature")

    override fun rootElement(): UiObject2 {
        return device.findObject(root)
    }

    fun wigetWatch() : UiObject2 {
       return rootElement().findObject(clock)

    }

    fun searchWigetWathc(): Boolean {
        return wigetWatch().hasObject(clock)
    }

    fun wigetWeather() : UiObject2 {
        return rootElement().findObject(weather)
    }

    fun openNotification() {
        device.openNotification()
    }
}