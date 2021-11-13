package com.bondidos.room.entityes

import androidx.room.ColumnInfo
import androidx.room.Relation

data class EmployeeWithDepartment (

    val name: String,
    val salary: Int,
    @ColumnInfo(name = "department_name")
    val departmentName: String

)
data class DepartmentWithEmployees(
    val id: Int,
    val name: String,

    @Relation(parentColumn = "id", entityColumn = "department_id")
    val employees: List<EmployeeDepartment>
)
