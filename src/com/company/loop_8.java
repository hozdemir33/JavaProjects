package com.company;

public class loop_8 {


    public static void main(String[] args) {

        // Type code to check if a given String Palindrome.
        //anna  reverse it anna or MOM TO MOM

        String name1 = "anna";
        String rev = "";

        for (int i = name1.length()-1; i >= 0; i--) {

            rev = rev + name1.charAt(i);

        }

        System.out.println(rev);

        if (name1.equals(rev)) {
            System.out.println("it is a PALINDROME");
        } else {
            System.out.println("it is NOT a PALINDROME");
        }
    }
}

