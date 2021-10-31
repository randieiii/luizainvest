package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class StockController {

    private final StockRepository repository;

    StockController(StockRepository repository) {
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/stocks")
    List<Stock> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/stocks")
    Stock newStock(@RequestBody Stock newStock) {
        return repository.save(newStock);
    }

    // Single item

    @GetMapping("/stocks/{id}")
    Stock one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new StockNotFoundException(id));
    }

    @PutMapping("/sttocks/{id}")
    Stock replaceStock(@RequestBody Stock newStock, @PathVariable Long id) {

        return repository.findById(id)
                .map(stock -> {
                    stock.setName(newStock.getName());
                    stock.setPrice(newStock.getPrice());
                    return repository.save(stock);
                })
                .orElseGet(() -> {
                    newStock.setId(id);
                    return repository.save(newStock);
                });
    }

    @DeleteMapping("/stocks/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}