package com.bondidos.room.entityes

import android.graphics.Bitmap
import androidx.room.*
import androidx.room.ColumnInfo.TEXT

@Entity(tableName = "employees",indices = [Index("salary"), Index(value = ["first_name","second_name"])])
data class Employee (
    @PrimaryKey(autoGenerate = true)
    val id: Long,

    @ColumnInfo(name = "first_name")
    val firstName: String,

    @ColumnInfo(name = "second_name")
    val secondName: String,

    val salary: Int,

    @Embedded(prefix = "address")
    val address: Address,

    @Ignore
    val avatar: Bitmap
    )

data class Address (
    var city: String? = null,
    var street: String? = null,
    var number: Int = 0
)