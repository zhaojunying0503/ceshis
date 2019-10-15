package com.example.koindemo.koin

import androidx.lifecycle.ViewModel

class MyViewModule(val repo: HelloReposity): ViewModel() {

    fun sayHello() = "${repo.giveHello()}   myViewMudle;"


}