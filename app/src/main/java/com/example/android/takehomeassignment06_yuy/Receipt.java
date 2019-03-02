package com.example.android.takehomeassignment06_yuy;

import java.io.Serializable;

public class Receipt implements Serializable {
    private double amount;
    private double tax_percentage;
    private double tip_percentage;

    public Receipt(double amount,double tax_p, double tip_p){
        this.amount = amount;
        this.tax_percentage = tax_p;
        this.tip_percentage = tip_p;
    }

    public double getAmount() {
        return amount;
    }

    public double getTax_percentage() {
        return tax_percentage;
    }

    public double getTip_percentage() {
        return tip_percentage;
    }
}
