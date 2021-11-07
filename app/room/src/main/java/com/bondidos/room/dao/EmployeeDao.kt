package com.bondidos.room.dao

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.bondidos.room.entityes.Employee

@Dao
interface EmployeeDao {

    @Query("SELECT * FROM employees")
    fun getAll(): List<Employee>

    @Query("SELECT * FROM employees where id = :id")
    fun getById(id: Long): Employee

    @Insert(onConflict = REPLACE)
    fun insert(employee: Employee)

    @Update
    fun update(employee: Employee)

    @Delete
    fun delete(employee: Employee)
}