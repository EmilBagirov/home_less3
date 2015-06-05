package com.company;

import java.util.Scanner;


public class PrimNumbers {

    public static void main(String[] args) {

    boolean isPrime=true;

    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    for (int i=2; i<input; i++) {
        if ((input%i)==0) {
            isPrime=false;
            continue;
        }
    }
    if (isPrime)
            System.out.println("This is a prime number");
    else
            System.out.println("This isn't a prime number");
    }
}
