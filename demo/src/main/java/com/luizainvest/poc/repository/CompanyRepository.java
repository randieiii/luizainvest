package com.luizainvest.poc.repository;

import com.luizainvest.poc.model.Company;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{

}