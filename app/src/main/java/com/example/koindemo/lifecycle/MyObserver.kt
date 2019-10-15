package com.example.koindemo.lifecycle

import android.os.Handler
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyObserver(var liftcyle:Lifecycle,var callback: Callback) : LifecycleObserver{

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public fun connectOnCreate(){
        p("connectOnCreate")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public fun connectOnResume(){
        p("connectOnResume")
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public fun disConnectOnDestroy() {
        p("disConnectOnDestroy")
    }


    fun p(string: String) {




        callback.update(string)
    }

}