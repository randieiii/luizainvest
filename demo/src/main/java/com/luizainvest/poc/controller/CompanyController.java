package com.luizainvest.poc.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.luizainvest.poc.exception.ResourceNotFoundException;
import com.luizainvest.poc.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luizainvest.poc.repository.CompanyRepository;


@RestController
@RequestMapping("/api/v1")
public class CompanyController {
    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping("/companies")
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @GetMapping("/companies/{id}")
    public ResponseEntity<Company> getCompanyById(@PathVariable(value = "id") Long companyId)
            throws ResourceNotFoundException {
        Company company = companyRepository.findById(companyId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + companyId));
        return ResponseEntity.ok().body(company);
    }

    @PostMapping("/companies")
    public Company createCompany(@RequestBody Company company) {
        return companyRepository.save(company);
    }

//    @PutMapping("/companies/{id}")
//    public ResponseEntity<Company> updateCompany(@PathVariable(value = "id") Long companyId,
//                                                   @RequestBody Company employeeDetails) throws ResourceNotFoundException {
//        Company company = companyRepository.findById(companyId)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + companyId));
//
//        company.setEmailId(employeeDetails.getEmailId());
//        company.setLastName(employeeDetails.getLastName());
//        company.setFirstName(employeeDetails.getFirstName());
//        final com updatedEmployee = employeeRepository.save(employee);
//        return ResponseEntity.ok(updatedEmployee);
//    }

//    @DeleteMapping("/employees/{id}")
//    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
//            throws ResourceNotFoundException {
//        Employee employee = employeeRepository.findById(employeeId)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
//
//        employeeRepository.delete(employee);
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("deleted", Boolean.TRUE);
//        return response;
//    }
}