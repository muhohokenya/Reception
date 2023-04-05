package com.hospital.reception.entity

import jakarta.persistence.*


@Table(name = "patients")
@Entity
open class Patient(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open val id:Long?,

    @Column(name = "name")
    open val name:String,

    @Column(name = "phoneNumber")
    open val phoneNumber:String,

    @Column(name = "age")
    open val age:String,
)