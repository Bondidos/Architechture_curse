package com.bondidos.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.bondidos.room.entityes.Car

@Dao
interface CarDao {

    @Query("SELECT * FROM car")
    fun getAll()

    @Insert
    fun insert(car: Car): Long

    @Delete
    fun delete(car: Car): Int
}