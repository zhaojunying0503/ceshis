package com.example.koindemo.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.view.View
import android.widget.ImageView
import com.example.koindemo.R
import kotlinx.android.synthetic.main.activity_moudle.*
import kotlinx.android.synthetic.main.activity_room.*
import kotlinx.android.synthetic.main.activity_room.btn

class RoomActivity : AppCompatActivity(), View.OnClickListener {

    internal var handler: Handler = object : Handler() {
        override fun handleMessage(msg: Message) {
            textView.text = msg.toString()
        }





    }


    override fun onClick(v: View?) {
        Thread(Runnable {
            var lists = dao?.getAll()
            var sb: StringBuffer = StringBuffer()
            for (i in lists!!.indices) {
                sb.append(lists[i].toString())
            }
            var msg = Message();
            msg.obj = sb.toString();
            handler.sendMessage(msg)
        }).start();








        



    }

    var dao:UserDao ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        Thread(Runnable {


        }).start()

       btn.setOnClickListener(this)
    }
}
