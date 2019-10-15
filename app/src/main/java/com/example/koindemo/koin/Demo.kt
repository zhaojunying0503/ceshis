package com.example.koindemo.koin

interface  HelloReposity{
    fun giveHello():String
}

class HelloReposityImpl :HelloReposity{
    override fun giveHello() = "hello"

}