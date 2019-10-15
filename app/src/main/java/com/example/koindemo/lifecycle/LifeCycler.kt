package com.example.koindemo.lifecycle

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class LifeCyclerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        var myObserver = MyObserver(lifecycle,object: Callback {
            override fun update(str: String) {
                Toast.makeText(this@LifeCyclerActivity, str+"Toast", Toast.LENGTH_SHORT).show()
            }
        })
        lifecycle.addObserver(myObserver)
    }


}