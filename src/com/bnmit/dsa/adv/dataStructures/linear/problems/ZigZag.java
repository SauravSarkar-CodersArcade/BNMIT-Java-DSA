package com.bnmit.dsa.adv.dataStructures.linear.problems;
public class ZigZag {
    static void zigZag1(int cols){
        for (int r=1; r<=3; r++){
            for (int c=1; c<=cols; c++){
                if(r==1 && c%4 == 3 ||
                   r==2 && c%2 == 0 ||
                   r==3 && c%4 == 1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void zigZag2(int cols){
        for (int r=1; r<=3; r++){
            for (int c=1; c<=cols; c++){
                if((r+c)%4 == 0 || (r==2 && c%4 == 0)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        zigZag1(9);
        zigZag2(17);

    }
}
