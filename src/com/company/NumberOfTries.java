package com.company;

import java.util.Scanner;

public class NumberOfTries {

    public static void main(String[] args) {

        int i = 0;
        Scanner sc = new Scanner(System.in);
        for (i = 0; sc.nextInt() != 5; i++) {
            sc.nextInt();
            i++;
        }
        System.out.println("Number of attempts is = " + (i + 1));
    }
}
