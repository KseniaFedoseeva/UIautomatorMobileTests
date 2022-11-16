package com.example.myapplication.pages

import androidx.test.uiautomator.By
import androidx.test.uiautomator.BySelector

object Desks {
    val tools = By.desc("Folder Tools")
}

object WacthWiget {
    val alarm = By.textContains("Alarm")
}

object WeatherWiget {
    val updateWeather = By.textContains("Last updated")
}

object HomePage{
    val clock : BySelector = By.res("com.huawei.android.totemweather:id/widget_time_hour")
    val weather: BySelector = By.res("com.huawei.android.totemweather:id/widget_highlow_temperature")
}