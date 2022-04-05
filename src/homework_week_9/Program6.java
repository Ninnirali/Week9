package homework_week_9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given array list
 */
public class Program6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> arrayList = new ArrayList<>();
        System.out.println(" Please enter 5 Values: ");
        for (int i = 0; i < 5; i++ ){
            arrayList.add(scanner.nextInt());
        }
        System.out.println("Please enter location number to get value:");
        int i = scanner.nextInt();
        if (i>=0 && i<=5){
            System.out.println("Value at Index " + i + " is: " + arrayList.get(i));
        }else{
            System.out.println("Please enter value between 0 and 5 ");
        }
        scanner.close();
    }
}
