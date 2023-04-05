package com.hospital.reception.controllers

import com.hospital.reception.dto.PatientDto
import com.hospital.reception.entity.Patient
import com.hospital.reception.services.PatientService
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/patients")
class PatientController(
    private val patientService: PatientService
) {

    @PostMapping("save")
    fun savePatient(@RequestBody @Valid patientDto: PatientDto):ResponseEntity<Any>{
        return  ResponseEntity.ok(patientService.savePatient(patientDto))
    }

    @GetMapping("")
    fun getAllPatients():MutableList<Patient>{
        return patientService.getAll()
    }

    @GetMapping("/{id}")
    fun findPatientById(@PathVariable id: Long):ResponseEntity<Patient>{
        return ResponseEntity.ok(patientService.findPatientById(id))
    }
}