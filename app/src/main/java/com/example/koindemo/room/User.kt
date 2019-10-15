package com.example.koindemo.room

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity
class User() {

    @PrimaryKey(autoGenerate = true)
   var id :Int =0;

    public var name:String?=null

    public var age:Int?=null


    override fun toString(): String {
        return "name: $name    ::: age :$age"
    }

}