package com.bondidos.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Transaction
import com.bondidos.room.entityes.Car
import com.bondidos.room.entityes.Employee

@Dao
abstract class EmployeeCarDao {

    @Insert
    abstract fun insertEmployee(employee: Employee)

    @Insert
    abstract fun insertCar(car: Car)

    @Transaction
    fun  insertEmployeeAndCar(employee: Employee,car: Car){
        insertCar(car)
        insertEmployee(employee)
    }
}