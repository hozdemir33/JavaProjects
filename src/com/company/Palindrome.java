package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {


        //WRITE A CODE TO DETERMINE IF A GIVEN STRING IS A PALINDROME OR NOT.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name");
        String name1= scan.nextLine();
//      String name="MOM";
        String rev="";
        for(int i=name1.length()-1;i>=0;i--){
            rev=rev+name1.charAt(i);
        }
        System.out.println(rev);
        if(rev.equals(name1)){
            System.out.println("It is a palindrome");
        } else{

            System.out.println("it is not a palindrome");
        }

    }
}
