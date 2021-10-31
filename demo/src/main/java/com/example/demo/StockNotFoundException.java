package com.example.demo;

class StockNotFoundException extends RuntimeException {

    StockNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}