package com.bridgelabz.logicalProgram;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number to verify that it is perfect or not ");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long i = 1;
        long sum = 0;
        while ( i <= num/2 ) {
            if (num % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        if(num == sum){
            System.out.println(num+"=>"+"is a PerfectNumber");
        }
        else {
            System.out.println("not a perfect number");
        }
    }
}
