package com.lambdaschool.piggybank.modules;

import javax.persistence.*;

@Entity
@Table(name = "piggybank");
public class PiggyBank {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long coinid;
    private String nameplural;
    private double value;
    private int quantity;

    public PiggyBank(String nameplural, double value, int quantity) {
        this.nameplural = nameplural;
        this.value = value;
        this.quantity = quantity;
    }

    public PiggyBank() {

    }

    public long getCoinid() {
        return coinid;
    }

    public void setCoinid(long coinid) {
        this.coinid = coinid;
    }

    public String getNameplural() {
        return nameplural;
    }

    public void setNameplural(String nameplural) {
        this.nameplural = nameplural;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
