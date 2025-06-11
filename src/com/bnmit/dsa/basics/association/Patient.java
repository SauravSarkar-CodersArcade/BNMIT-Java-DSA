package com.bnmit.dsa.basics.association;
public class Patient {
    String patientName;
    int patientAge;
    String doa;
    String disease;
    Information info;
    Payment pay;
    public Patient(String patientName, int patientAge, String doa, String disease,
                   Information info, Payment pay) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.doa = doa;
        this.disease = disease;
        this.info = info;
        this.pay = pay;
    }
    public void patientDetails(){
        System.out.println("Name: " + this.patientName);
        System.out.println("Age: " + this.patientAge);
        System.out.println("Date Of Arrival " + this.doa);
        System.out.println("Disease: " + this.disease);
        System.out.println("Block No: " + this.info.blockNo);
        System.out.println("Floor Number: " + this.info.floorNo);
        System.out.println("Room Number: " + this.info.roomNo);
        System.out.println("Bed Number: " + this.info.bedNo);
        System.out.println("Reg Fees: " + this.pay.regFees);
        System.out.println("Adm Fees: " + this.pay.admFees);
        System.out.println("Balance Amount: " + this.pay.balAmt);
    }
    // HuffMan Encoding
    public static void main(String[] args) {
        Information info = new Information("C", 3,
                301, 4);
        Payment pay = new Payment(3000, 20000, 5000);
        Patient p1 = new Patient("ABC", 21,
                "11/06/2025", "Jaundice", info,pay);
        p1.patientDetails();
    }
}
