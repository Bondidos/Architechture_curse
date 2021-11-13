package com.bondidos.room.dao

import androidx.room.*
import com.bondidos.room.entityes.Employee

@Dao
interface EmployeeDaoTest {

    @Query("select * from employees")
    fun getAll(): List<Employee>

    @Query("select * from employees order by salary desc")
    fun getAllOrderBySalary():List<Employee>

    @Insert
    fun insert(employee: Employee)

    @Insert
    fun insertAll(employees: List<Employee>)

    @Update
    fun update(employee: Employee)

    @Delete
    fun delete (employee: Employee)

    @Query("Delete from employees")
    fun deleteAll()
}