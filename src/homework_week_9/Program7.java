package homework_week_9;

import java.util.ArrayList;

/**
 * Write a Java program to test an array list is empty or not. Define array list with underground tube names
 */

public class Program7 {

    public static void main(String[] args) {

        ArrayList<String> tubeList = new ArrayList<>(10);

        tubeList.add("Victoria");
        tubeList.add("Circle");
        tubeList.add("District");
        tubeList.add("Piccadilly");
        tubeList.add("Northern");

        boolean answer = tubeList.isEmpty();

        System.out.println(answer);

        }


    }


