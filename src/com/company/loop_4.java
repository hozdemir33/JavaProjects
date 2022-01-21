package com.company;

import java.util.Scanner;

public class loop_4 {

    public static void main(String[] args) {

        /*

	  Ask user to enter SSN( 9 DIGITS)
	  Print the SSN on the console after converting first digits to
	  Ex :  123456789 ===> *****6789

	 */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a SSN number#");
        String snn = scan.next();
        System.out.println(snn);

        String first5digits="*****";
        String last4digits=snn.substring(5);

        System.out.println(first5digits+last4digits);


    }
}
