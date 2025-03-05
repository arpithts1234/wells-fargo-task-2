package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long securityId;

    @Column(nullable = false)
    private String securityName;

    @Column(nullable = false)
    private String securityType;

    @Column(nullable = false)
    private double securityValue;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    protected Security() {}

    public Security(String securityName, String securityType, double securityValue, Portfolio portfolio) {
        this.securityName = securityName;
        this.securityType = securityType;
        this.securityValue = securityValue;
        this.portfolio = portfolio;
    }

    public long getSecurityId() { return securityId; }
    public String getSecurityName() { return securityName; }
    public void setSecurityName(String securityName) { this.securityName = securityName; }
    public String getSecurityType() { return securityType; }
    public void setSecurityType(String securityType) { this.securityType = securityType; }
    public double getSecurityValue() { return securityValue; }
    public void setSecurityValue(double securityValue) { this.securityValue = securityValue; }
    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
}
