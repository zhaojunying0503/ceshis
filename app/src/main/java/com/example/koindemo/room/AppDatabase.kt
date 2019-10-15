package com.example.koindemo.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//@Database(entities =  [User::class], version = 1)  // 注释
//abstract class AppDatabase :RoomDatabase(){
//    companion object {
//        fun create(context: Context, dbName: String): AppDatabase {
//            return Room.databaseBuilder(context, AppDatabase::class.java, dbName)
//                .fallbackToDestructiveMigration()
//                .build()
//        }
//    }
//
//    abstract fun userDao(): UserDao
//
//}