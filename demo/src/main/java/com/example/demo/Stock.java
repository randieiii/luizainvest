package com.example.demo;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Stock {

    private @Id @GeneratedValue Long id;
    private String name;
    private Double price;

    Stock() {}
    Stock(String name, Double price) {

        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Stock))
            return false;
        Stock stock = (Stock) o;
        return Objects.equals(this.id, stock.id) && Objects.equals(this.name, stock.name)
                && Objects.equals(this.price, this.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.price);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.price.toString() + '\'' + '}';
    }
}