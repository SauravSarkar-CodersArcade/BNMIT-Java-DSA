package com.bnmit.dsa.adv.serialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class SerializeExample {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Yathin";
        e.address = "Uttarahalli";
        e.SSN = 298764;
        e.phone = 1234566;
        try {
            FileOutputStream fileOut = new FileOutputStream(
                    System.getProperty("user.dir") +
                            "/Java/employee.ser"
            );
            ObjectOutputStream out = new ObjectOutputStream(fileOut); // SER
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("The serialized data is saved in employee.ser");
        }catch (IOException i){
            i.printStackTrace();
        }finally {
            System.out.println("End of execution..!!");
        }
    }
}
