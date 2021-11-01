package com.luizainvest.poc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {

    private long company_id;
    private String name;
    private String symbol;
    private String sector;
    private float market_cap;
    private int ipo_year;
    private String country;


    public Company() {

    }

    public Company(long company_id, String name, String symbol, String sector, float market_cap, int ipo_year, String country) {
        this.company_id = company_id;
        this.name = name;
        this.symbol = symbol;
        this.sector = sector;
        this.market_cap = market_cap;
        this.ipo_year = ipo_year;
        this.country = country;
    }


    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "symbol", nullable = false)
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Column(name = "sector", nullable = false)
    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Column(name = "market_cap", nullable = false)
    public float getMarket_cap() {
        return market_cap;
    }

    public void setMarket_cap(float market_cap) {
        this.market_cap = market_cap;
    }

    @Column(name = "ipo_year", nullable = false)
    public int getIpo_year() {
        return ipo_year;
    }

    public void setIpo_year(int ipo_year) {
        this.ipo_year = ipo_year;
    }

    @Column(name = "country", nullable = false)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(long company_id) {
        this.company_id = company_id;
    }

    @Override
    public String toString() {
        return "Employee [id=" + company_id + ", name=" + name + ", symbol=" + symbol + ", sector=" + sector
                + "]";
    }
}