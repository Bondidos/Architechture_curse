package com.bondidos.room.dao

import android.database.Cursor
import androidx.lifecycle.LiveData
import androidx.room.ColumnInfo
import androidx.room.Dao
import androidx.room.Query
import com.bondidos.room.entityes.Employee
import com.bondidos.room.entityes.Employeee

@Dao
interface EmployeeeDao {

    @Query("SELECT * FROM employeee")
    fun getAll(): List<Employeee>

    @Query("SELECT * FROM employeee")
    fun getAllCursor(): Cursor

    @Query("SELECT * FROM employeee")
    fun getAllLiveData(): LiveData<List<Employeee>>

    @Query("SELECT * FROM employeee WHERE id = :id")
    fun getById(id: Long): Employeee

    @Query("SELECT * FROM employeee WHERE salary > :salary")
    fun getAllWithSalaryMoreThan(salary: Int): List<Employeee>

    @Query("SELECT * FROM employeee WHERE salary BETWEEN :min AND :max")
    fun getAllWithSalaryBetween(min: Int, max: Int): List<Employee>

    @Query("SELECT * FROM employeee WHERE first_name LIKE :name OR last_name LIKE :name")
    fun getEmployeeByName(name:String): List<Employeee>

    @Query("SELECT * FROM employeee where id in (:list)")
    fun getAllByIdList(list: List<Long>): List<Employeee>

    @Query("select first_name, last_name from employeee")
    fun getNames(): List<Name>

    @Query("update employeee set salary = :newSalary where id in (:list)")
    fun updateSalaryById(list: List<Long>, newSalary: Int): Int // number of updated rows

    @Query("delete from employeee where id in (:list)")
    fun deleteByList(list: List<Long>): Int // number of deleted employeees


}

data class Name(
    @ColumnInfo(name = "first_name")
    val firstName: String,

    @ColumnInfo(name = "last_name")
    val secondName: String
)