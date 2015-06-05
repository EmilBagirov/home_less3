package com.company;


public class Exclude13And4 {

    public static void main(String[] args) {

        int j = 0;
        for (int i = 4; i <= 99994; i++) {
            String str = String.valueOf(i);
            if (str.indexOf("4") != -1 || str.indexOf("1") != -1 && str.indexOf("1") + 1 == str.indexOf("3")) {
                j++;
            }
        }
        System.out.println("Exceptions number is " + j);
    }
}