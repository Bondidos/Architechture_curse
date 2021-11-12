package com.bondidos.room.dao

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.bondidos.room.entityes.Employee
import io.reactivex.Flowable
import io.reactivex.Maybe
import io.reactivex.Single

@Dao
interface EmployeeDao {

    @Query("SELECT * FROM employees")
    fun getAll(): Flowable<List<Employee>>

    @Query("SELECT * FROM employees where id = :id")
    fun getById(id: Long): Flowable<Employee>

    @Query("SELECT * FROM employees where id = :id")
    fun getByIdSingle(id: Long): Single<Employee>

    @Query("SELECT * FROM employees where id = :id")
    fun getByIdMaybe(id: Long): Maybe<Employee>

    @Insert(onConflict = REPLACE)
    fun insert(employee: Employee)

    @Update
    fun update(employee: Employee)

    @Delete
    fun delete(employee: Employee)
}