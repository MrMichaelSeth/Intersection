package main.java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Create a function that, given two Array Lists, returns the intersection of the two functions
        - Where the two Array Lists have similar values
         */

        //Original Idea
        // The two initial lists
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        num1.add(12);
        num1.add(3);
        num1.add(-7);
        num1.add(1);
        num1.add(25);

        ArrayList<Integer> num2 = new ArrayList<Integer>();
        num2.add(-7);
        num2.add(9);
        num2.add(12);
        num2.add(80);
        num2.add(1);

        //Calling the function & displaying the answer
        System.out.println(theIntersection(num1, num2));

        }

        //Creating the Function
        public static ArrayList<Integer> theIntersection(ArrayList<Integer> num1, ArrayList<Integer> num2) {

            ArrayList<Integer> finalList = new ArrayList<Integer>();

            for (int x = 0; x < num1.size(); x++){
                if (num2.contains(num1.get(x))){
                    finalList.add(num1.get(x));
                }
            }

            return finalList;

    }
}

