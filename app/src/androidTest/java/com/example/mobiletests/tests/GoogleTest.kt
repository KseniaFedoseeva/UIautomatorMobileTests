package com.example.mobiletests.tests

import androidx.test.uiautomator.By
import androidx.test.uiautomator.Until
import org.junit.Assert
import org.junit.Test

class GoogleTest : BaseTest() {

    @Test
    fun searchPhotos() {

        homePageScreen.directoryGoogle().clickAndWait(Until.newWindow(), 2000)

        for( i in googleScreen.listGoogleTools()){
            if (i.text.equals("Photos")) {i.clickAndWait(Until.newWindow(), 3000)}
        }

        Assert.assertTrue("Не открылась страница фото", photoGoogleScreen.rootToolbar().
        hasObject(By.res("com.google.android.apps.photos:id/product_lockup_view")))

    }
}