package com.example.myapplication.pages

import com.example.myapplication.BaseTest

open class Move : BaseTest() {

    fun rightSwipe() {
        device.swipe(1033, 1346, 531, 1346, 20)
    }

    fun leftSwipe() {
        device.swipe( 531, 1346, 1033, 1346,20)
    }
}