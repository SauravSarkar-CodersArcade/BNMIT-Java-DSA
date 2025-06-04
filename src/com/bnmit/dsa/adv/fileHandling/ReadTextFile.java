package com.bnmit.dsa.adv.fileHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadTextFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./Java/DSA/bnmit.txt");
        Scanner reader = new Scanner(file);
        while (reader.hasNext()){
            String data = reader.nextLine();
            System.out.println(data);
        }
        reader.close();
    }
}
