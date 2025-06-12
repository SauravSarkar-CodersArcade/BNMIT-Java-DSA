package com.bnmit.dsa.adv.serialization;
import java.io.Serializable;
public class Employee implements Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int phone;
}
