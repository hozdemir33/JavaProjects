package com.company;

public class loop_6 {


    public static void main(String[] args) {

        String name= "Strawberry";  //finding the uniques elements from a String...

        for(int i=0; i<name.length();i++){

            char newContainer=name.charAt(i);

            if(name.indexOf(newContainer)==name.lastIndexOf(newContainer)){

                System.out.print(newContainer);
            }




        }


    }
}
