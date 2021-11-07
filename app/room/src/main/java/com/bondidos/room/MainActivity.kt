package com.bondidos.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bondidos.room.dao.EmployeeDao
import com.bondidos.room.entityes.Employee
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var db: AppDataBase
    lateinit var employeeDao: EmployeeDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        employeeDao = db.employeeDao()
    }
}