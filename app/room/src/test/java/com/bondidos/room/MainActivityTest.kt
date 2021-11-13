package com.bondidos.room

import dagger.hilt.android.AndroidEntryPoint
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test
import javax.inject.Inject

@AndroidEntryPoint
class MainActivityTest {

    @Inject
    private lateinit var db: AppDataBase

    @Before
    fun setUp() {
        db.testDao()
    }

    @Test
    fun test(){
        true
    }

    @After
    fun tearDown() {
        db.close()
    }
}