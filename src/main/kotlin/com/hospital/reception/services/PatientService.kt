package com.hospital.reception.services

import com.hospital.reception.dto.PatientDto
import com.hospital.reception.entity.Patient
import com.hospital.reception.repository.PatientRepository
import org.springframework.stereotype.Service

@Service
class PatientService(
    private val patientRepository: PatientRepository
) {

    fun savePatient(patientDto: PatientDto){
        val patient = Patient(
            id = null,
            name = patientDto.name,
            phoneNumber = patientDto.phoneNumber,
            age = patientDto.age
        )
        patientRepository.save(patient)
    }


    fun getAll():MutableList<Patient>{
        return patientRepository.findAll()
    }


    fun findPatientById(id:Long):Patient{
        return patientRepository.findPatientById(id)
    }
}