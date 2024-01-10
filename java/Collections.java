import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Collections{

    public static void main(String[] args){
        //  LIST
        // 1. ARRAYLIST
        // ArrayList<String> al = new ArrayList<>();
        // al.add("Rakesh");                 // insert an elemnt in the list
        // al.add("Suresh");

        /*  in memory
        if arraylist's size becomes 'n' after adding elements 
        then the original size is incremented by n+(n/2)+1
        */

        // functions
        // al.add(2,"ramya");
        // al.add(0,"pakya");   
         //this will not remove the existing string from the zeroth position it will add the new string at the zeroth position and the list will move forward by one place.
        // [pakya, Rakesh, Suresh, ramya] -> output
        //  System.out.println(al);

         List<Integer> oldList = new ArrayList<>();
         oldList.add(1);
         oldList.add(6);
         oldList.add(3);
         oldList.add(4);
         oldList.add(7);
         oldList.add(8);
         oldList.add(9);


        // List<Integer> newList = new ArrayList<>();
        // newList.addAll(oldList);
        // System.out.println(newList);

        // .get(index) - access an element at index

        System.out.println(oldList.get(1));    //output -> 6
        oldList.remove(1);
        System.out.println(oldList.get(1));    //output -> 3

    }
}