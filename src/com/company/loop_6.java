package com.company;

public class loop_6 {


    public static void main(String[] args) {

        String name = "Strawberry";  //finding the uniques elements from a String...

        for (int i = 0; i < name.length(); i++) {

            char newContainer = name.charAt(i);

            if (name.indexOf(newContainer) == name.lastIndexOf(newContainer)) {

                System.out.print(newContainer);


                //Type code to print a String in reverse after removing spaces
                //   Example: Ali Can ==> naCilA


                String name1 = "Ali Can";
                String container = "";

                for (int j = name1.length() - 1; j >= 0; j--) {
                    char kk = name1.charAt(j);

                    if (kk != ' ') {

                        container = container + kk;


                    }
                    System.out.println(container);
                }


            }
        }
    }
}