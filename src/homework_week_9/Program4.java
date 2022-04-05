package homework_week_9;

import java.util.ArrayList;
/**
 * Write a Java program to create a new array list, add some colours (string) and printout the collection using for each loop.
 */
public class Program4 {

    public static void main(String[] args) {
        ArrayList<String> colourList = new ArrayList<>();
        colourList.add("Red");
        colourList.add("Orange");
        colourList.add("Yellow");
        colourList.add("Green");
        colourList.add("Blue");
        colourList.add("Indigo");
        colourList.add("Violet");

        for(String elements:colourList){
            System.out.println(elements);
        }
    }
}
