package com.example.koindemo.livedate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.koindemo.R
import kotlinx.android.synthetic.main.activity_live_data.*

class LiveDataActivity : AppCompatActivity() {


    val nameObservable = Observer<String> {   // 创建观察者对象
        textView.text = it       // 定义onChange（）方法中的操作
    }
    var mMoudle :TextViewMoudle? =null;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)

        mMoudle = ViewModelProviders.of(this).get(TextViewMoudle::class.java)

        mMoudle!!.mCurrent!!.observe(this,nameObservable)

        btn1.setOnClickListener{
            mMoudle!!.mCurrent!!.value = "11111"
        }

        btn2.setOnClickListener{
            mMoudle!!.mCurrent!!.value = "22222"
        }

    }



}
