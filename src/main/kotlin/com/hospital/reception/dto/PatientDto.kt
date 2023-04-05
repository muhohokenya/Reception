package com.hospital.reception.dto

import jakarta.validation.constraints.NotBlank


open class PatientDto(
    open val id:Long?,

    @field:NotBlank(message = "Name is mandatory")
    open val name:String,

    @field:NotBlank(message = "Phone Number is mandatory")
    open val phoneNumber:String,

    @field:NotBlank(message = "Age is mandatory")
    open val age:String
)