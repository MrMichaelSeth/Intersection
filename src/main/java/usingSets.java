package main.java;

import java.util.*;
public class usingSets {
    public static void main(String[] args) {

        // Creating the sets and then
        Set<Integer> set1 = new HashSet<Integer>();

        Set<Integer> set2 = new HashSet<Integer>();

        //Using Arrays.asList -> runs in O(1) time.
        set1.addAll(Arrays.asList(
                new Integer[] { 12, 3, -7, 1, 25}));

        set2.addAll(Arrays.asList(
                new Integer[] { -7, 9, 12, 80, 1}));


        // Creating a new set and passing in th elements of 1 set
        // Use .retainsAll to check for intersection; works like .contains
        Set<Integer> intersection = new HashSet<Integer>(set1);
        intersection.retainAll(set2);

        System.out.println(intersection);

        //This method should be more efficient since it doesn't have to iterate through the sets
    }
}
