package com.hospital.reception.repository

import com.hospital.reception.entity.Patient
import org.springframework.data.jpa.repository.JpaRepository

interface PatientRepository:JpaRepository<Patient,Long> {

    fun findPatientById(id:Long):Patient
}