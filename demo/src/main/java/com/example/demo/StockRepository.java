package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;

interface StockRepository extends JpaRepository<Stock, Long> {

}