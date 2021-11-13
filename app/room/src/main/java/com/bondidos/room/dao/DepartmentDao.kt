package com.bondidos.room.dao

import androidx.room.Dao
import androidx.room.Query
import com.bondidos.room.entityes.DepartmentWithEmployees
import com.bondidos.room.entityes.EmployeeWithDepartment

@Dao
interface DepartmentDao {

    @Query("select EmployeeDepartment.name, EmployeeDepartment.id, " +
            "Department.name as department_name from EmployeeDepartment, " +
            "department where department.id == EmployeeDepartment.department_id ")
    fun  getEmployeeWithDepartment(): List<EmployeeWithDepartment>
}

@Dao
interface DepartmentDao2{

    @Query("select id, name from department")
    fun getDepartmentsWithEmployees(): List<DepartmentWithEmployees>
}
