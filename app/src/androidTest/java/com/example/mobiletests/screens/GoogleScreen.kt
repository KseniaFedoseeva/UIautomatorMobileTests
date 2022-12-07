package com.example.mobiletests.screens

import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiObject2

class GoogleScreen : BaseScreen() {

    protected val root = By.res("com.huawei.android.launcher:id/folder_page_one")

    override fun rootElement(): UiObject2 {
        return device.findObject(root)
    }

    fun listGoogleTools(): List<UiObject2>{
        return rootElement().findObjects(By.clazz("android.widget.TextView"))
    }
}