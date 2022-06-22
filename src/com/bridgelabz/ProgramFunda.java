package com.bridgelabz;

import java.util.Scanner;  //import Scanner
public class ProgramFunda {
    public static void main(String[] args){  //Entry Point of program
        Scanner scanner = new Scanner(System.in); //scanner object creation
        System.out.println("Enter the Dividend and Divisor");
        int dividend = scanner.nextInt(); // Int input
        int divisor = scanner.nextInt();

        int quotient = dividend/divisor;
        int remainder = dividend%divisor;

        System.out.println("The Quotient ="+quotient+" and the Remainder is ="+remainder);
    }
}
