package com.example.myapplication

import java.lang.Exception

interface BaseMobile {

    fun clickWiget(){
        throw Exception("clickWiget")
    }
}