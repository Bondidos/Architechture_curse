package com.bondidos.room.entityes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Department (
        @PrimaryKey(autoGenerate = true)
        val id: Int,
        val name: String
)

@Entity
data class EmployeeDepartment(
    @PrimaryKey
    val id: Int,
    val name: String,
    val salary: Int,
    @ColumnInfo(name = "department_id")
    val departmentId: Int
)