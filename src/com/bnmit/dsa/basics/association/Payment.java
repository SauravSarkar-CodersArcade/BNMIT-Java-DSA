package com.bnmit.dsa.basics.association;

public class Payment {
    public Payment(double regFees, double admFees, double balAmt) {
        this.regFees = regFees;
        this.admFees = admFees;
        this.balAmt = balAmt;
    }

    double regFees, admFees, balAmt;
}
