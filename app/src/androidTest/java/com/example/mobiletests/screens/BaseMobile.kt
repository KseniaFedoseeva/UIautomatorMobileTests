package com.example.mobiletests.screens

import java.lang.Exception

interface BaseMobile {

    fun clickWiget(){
        throw Exception("clickWiget")
    }
}