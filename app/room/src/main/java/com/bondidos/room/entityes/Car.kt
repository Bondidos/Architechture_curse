package com.bondidos.room.entityes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey

@Entity(foreignKeys =
[ForeignKey(
    entity = Employee::class,
    parentColumns = arrayOf("id"),
    childColumns = arrayOf("employee_id"),
    onDelete = CASCADE
)])
data class Car (
    @PrimaryKey
    val id: Long,
    val model: String,
    val year: Int,
    @ColumnInfo(name = "employee_id")
    val employeeId: Long
        )