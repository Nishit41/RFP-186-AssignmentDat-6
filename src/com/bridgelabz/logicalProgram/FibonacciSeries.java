package com.bridgelabz.logicalProgram;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of term You Want");
       int numberOfTime  = sc.nextInt();
       int n1 = 0;
       int n2 = 1;
       System.out.print( n1+" "+n2 );
       for( int i = 2 ; i<= numberOfTime ; i++){
            int  n3 = n1 + n2 ;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
