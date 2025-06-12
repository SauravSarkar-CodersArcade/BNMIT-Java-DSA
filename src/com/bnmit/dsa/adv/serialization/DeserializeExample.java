package com.bnmit.dsa.adv.serialization;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class DeserializeExample {
    public static void main(String[] args) {
        Employee e = null;
        try {
            FileInputStream fileIn = new FileInputStream(
                    System.getProperty("user.dir") +
                            "/Java/employee.ser"
            );
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
        }catch (IOException i){
            i.printStackTrace();
        }catch (ClassNotFoundException c){
            System.out.println("Class Employee Not Found..!!");
            c.printStackTrace();
            return;
        }finally {
            System.out.println("End of execution.");
        }
        System.out.println("The deserialized employee details are: ");
        System.out.println("Name: " + e.name);
        System.out.println("Address of the employee: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Phone: " + e.phone);
    }
}
