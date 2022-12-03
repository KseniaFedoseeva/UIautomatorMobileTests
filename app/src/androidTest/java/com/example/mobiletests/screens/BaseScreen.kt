package com.example.mobiletests.screens

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiObject2

abstract class BaseScreen {

  protected  val device : UiDevice
        get() = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())


    abstract fun rootElement() : UiObject2



}