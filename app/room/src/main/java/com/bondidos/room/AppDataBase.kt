package com.bondidos.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bondidos.room.dao.CarDao
import com.bondidos.room.dao.EmployeeDao
import com.bondidos.room.dao.EmployeeDaoTest
import com.bondidos.room.entityes.Car
import com.bondidos.room.entityes.Employee

@Database(entities = [ Employee::class, Car::class ], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun employeeDao(): EmployeeDao
    abstract fun carDao(): CarDao
    abstract fun testDao(): EmployeeDaoTest
}