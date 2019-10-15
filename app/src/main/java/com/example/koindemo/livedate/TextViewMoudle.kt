package com.example.koindemo.livedate

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel

class TextViewMoudle  : ViewModel(){

    var mCurrent:MutableLiveData<String> ? =null

    get() {
       if (field == null) {
           field = MutableLiveData()
        }
        return field
    }



}