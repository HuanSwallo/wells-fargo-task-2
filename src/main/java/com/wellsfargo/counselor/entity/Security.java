package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    @Column(unique = true, nullable = false)
    private Long securityId;

    @ManyToOne
    @JoinColumn(name="portfolio_portfolioId")
    private Portfolio portfolio;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private String category;

    @Column(nullable=false)
    private Float purchasePrice;

    @Column(nullable=false)
    private String purchaseDate;

    @Column(nullable=false)
    private Integer quantity;

    protected Security() {

    }

    public Security(Portfolio portfolio, String name, String category, Float purchasePrice, String purchaseDate, Integer quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getSecurityId() { return securityId; }

    public Portfolio getPortfolio() { return portfolio; }

    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public Float getPurchasePrice() { return purchasePrice; }

    public void setPurchasePrice(Float purchasePrice) { this.purchasePrice = purchasePrice; }

    public String getPurchaseDate() { return purchaseDate; }

    public void setPurchaseDate(String purchaseDate) { this.purchaseDate = purchaseDate; }

    public Integer getQuantity() { return quantity; }

    public void setQuantity(Integer quantity) { this.quantity = quantity; }
}
