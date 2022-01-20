package com.company;

public class loops1 {
    public static void main(String[] args) {

//		//Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
//		with a space between consecutive integers

        for(int i=120; i>12; i--){
            if(i%4==0 && i%6==0){

                System.out.print(" " + i+ " ");//  120  108  96  84  72  60  48  36  24
            }

        }

    }
}
