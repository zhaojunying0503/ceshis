package com.example.koindemo.viewmoudle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProviders
import com.example.koindemo.R
import kotlinx.android.synthetic.main.activity_moudle.*

class MoudleActivity : AppCompatActivity(), View.OnClickListener {

    internal var moudle: Moudle? = null
    override fun onClick(v: View?) {
        moudle?.textName = "Change = 22222"
        tv.text = moudle?.textName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moudle)
        moudle = ViewModelProviders.of(this)[Moudle::class.java]
        tv.text = moudle?.textName
        btn.setOnClickListener(this)
    }
}
