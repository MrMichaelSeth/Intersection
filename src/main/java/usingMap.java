package main.java;
import java.util.*;

public class usingMap {

    public static void main(String[] args) {

        //Array List creation
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list1.addAll(Arrays.asList( new Integer[] { 12, 3, -7, 1, 25}));

        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list2.addAll(Arrays.asList( new Integer[] { -7, 9, 12, 80, 1}));

        //Create map and final array
        HashMap<Integer, Integer> map = new HashMap<>();

        ArrayList<Integer> result = new ArrayList<Integer>();

        //Add one list to the map
        for ( int x = 0; x < list1.size(); x++){
            map.put(list1.get(x), 1);
        }
        //compare the 2nd list to the map
        for ( int j = 0; j < list2.size(); j++){

            if ( map.containsKey(list2.get(j)) ){
               result.add( list2.get(j) );
            }
        }
       System.out.println(result);
    }

}