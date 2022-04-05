package homework_week_9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Program3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> i = new ArrayList();
        System.out.println("Enter 10 number of your choice");
        for(int j = 0; j<10; j++){
            i.add(scanner.nextInt());
        }
        scanner.close();
        System.out.println("Given integer array is");
        for(int element : i){
            System.out.print(element + ",");
        }
        System.out.println("");
        System.out.println("Reverse of the given array ia ");
        for(int j = i.size()-1; j >=0; j--){
            System.out.print(i.get(j) + ",");
        }
    }
}
