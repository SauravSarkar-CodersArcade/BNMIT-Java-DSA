package com.bnmit.dsa.adv.fileHandling;
import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        // Absolute Path -> Root Directory
        File folder = new File("D:\\Idea Projects\\BNMIT-S60-DSA\\Java\\DSA");
        if (folder.mkdir()){
            System.out.println("Folder " + folder.getName() + " created.");
        }else {
            System.out.println("Folder already exists.");
        }
    }
}
