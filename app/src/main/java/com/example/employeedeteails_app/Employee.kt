package com.example.employeedeteails_app

import java.io.Serializable


data class Employee(
    val image: Int,
    val name: String,
    val id: String,
    val title: String,
    val email: String,
    val salary: String,
    val address: String
) : Serializable


