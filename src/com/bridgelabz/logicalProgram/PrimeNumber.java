package com.bridgelabz.logicalProgram;

import java.util.Scanner;

public class PrimeNumber {
   static int i;
    public static void main(String[] args) {
        System.out.println("Enter a num to verify is a prime number or not ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for ( i = 2; i <= num - 1; i++) {
            if (num % i == 0)
                break;
        }
        if ( i == num ) {
                System.out.println("PrimeNumber");
            }
        else {
                System.out.println("NotPrimeNumber");
            }
    }
}
