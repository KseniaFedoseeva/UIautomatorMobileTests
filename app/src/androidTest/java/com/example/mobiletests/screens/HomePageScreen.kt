package com.example.mobiletests.screens

import androidx.test.uiautomator.By
import androidx.test.uiautomator.BySelector
import androidx.test.uiautomator.UiObject2
import com.example.mobiletests.pages.HomePage

open class HomePageScreen: BaseScreen(), BaseMobile {

    protected val root = By.clazz("android.view.ViewGroup")
    val search = By.desc("Chrome search")
    val clock : BySelector = By.res("com.huawei.android.totemweather:id/widget_time_hour")
    val weather: BySelector = By.res("com.huawei.android.totemweather:id/widget_highlow_temperature")

    override fun rootElement(): UiObject2 {
        return device.findObject(root)
    }

    fun wigetWatch() : UiObject2 {
       return rootElement().findObject(clock)

    }

    fun wigetWeather() : UiObject2 {
        return rootElement().findObject(weather)
    }

    fun openNotification() {
        device.openNotification()
    }
}