package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Task1 - Number of tries
        int i=0;
        Scanner sc = new Scanner(System.in);
        for (i=0; sc.nextInt()!=5; i++) {
            sc.nextInt();
            i++;
        }
        System.out.println("Number of attempts is = " + (i+1));

        //Task2 - Prime Numbers
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

        //Task3 - Exclude 13 and 4
        int j=0;
        for (int i=4; i<=99994; i++) {
            String str = String.valueOf(i);
            if (str.indexOf("4") != -1 || str.indexOf("1") != -1 && str.indexOf("1")+1==str.indexOf("3")) {
                j++;
            }
        }
            System.out.println("Exceptions number is " + j);
        }

    /* Task3_another version
     int j=0;
        for (int i=1; i<=100000; i++){

           String val = Integer.toString(i);

            if (val.contains("13") || val.contains("4")) {
                j++;

            }
        }
        System.out.println("val: "+j);
    }
     */

    }
