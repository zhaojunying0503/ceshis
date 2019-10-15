package com.example.koindemo;

import android.os.Handler;
import android.os.Message;

import com.example.koindemo.viewmoudle.Moudle;


import java.util.logging.LogRecord;

public class Demo {

    Moudle moudle = null;


    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };

}
