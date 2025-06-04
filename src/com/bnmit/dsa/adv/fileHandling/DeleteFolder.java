package com.bnmit.dsa.adv.fileHandling;
import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        // Relative Path -> Current Directory
        // BNMIT-S60-DSA\Java\DSA
        File folder = new File("./Java/DSA");
        if (folder.delete()){
            System.out.println("Folder " + folder.getName() + " deleted.");
        }else {
            System.out.println("Folder doesn't exists.");
        }
    }
}
