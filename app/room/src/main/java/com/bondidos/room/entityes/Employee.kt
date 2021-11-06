package com.bondidos.room.entityes

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "employees")
data class Employee (
    @PrimaryKey
    val id: Long,
    val name: String,
    val salary: Int
    )