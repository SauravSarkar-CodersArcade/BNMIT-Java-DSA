package com.bnmit.dsa.basics.patternMatching;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternMatching {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("core java", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("We are learning CORE JAVA");
        boolean matchFound = matcher.find();
        System.out.println(matchFound);
        if(matchFound){
            System.out.println("Correct Match");
        }else {
            System.out.println("Data Mismatch");
        }
    }
}
