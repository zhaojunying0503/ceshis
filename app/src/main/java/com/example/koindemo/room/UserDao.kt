package com.example.koindemo.room

import androidx.room.*


@Dao
interface UserDao {


    @Query("SELECT * FROM user")
    fun getAll(): List<User>


    @Insert
    fun insertAll(vararg users: User)

    @Insert
    fun insert(user: User)

    @Delete
    fun delete(user: User)
}