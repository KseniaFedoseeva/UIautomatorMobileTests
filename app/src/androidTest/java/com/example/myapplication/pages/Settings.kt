package com.example.myapplication.pages

import androidx.test.uiautomator.By
import androidx.test.uiautomator.BySelector

object Settings {

    val settings = By.text("Settings")
}

object HomePage{
    val clock : BySelector = By.res("com.huawei.android.totemweather:id/widget_time_hour")
    val weather: BySelector = By.res("com.huawei.android.totemweather:id/widget_highlow_temperature")
}

object Desks {
    val tools = By.desc("Folder Tools")
}

object Notification {
    val sound = By.desc("Sound")
    val silent = By.desc("Silent")
    val vibration = By.desc("Vibration")
}

object WeatherWiget {
    val updateWeather = By.textContains("Last updated")
}

object WacthWiget {
    val alarm = By.textContains("Alarm")
}

