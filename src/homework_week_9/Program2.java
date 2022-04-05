package homework_week_9;

import java.util.Scanner;
/**
 * Re write the student mark sheet programme using if else and while loop.
 */

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Marks Sheet");
        System.out.println("Enter the name of Student : ");
        String name = sc.next();
        System.out.println(" Enter the Roll number :");
        int roll = sc.nextInt();
        System.out.println("Enter the Marks of Maths \t:\t");
        int maths = sc.nextInt();

        // While loop
        while (!(0 <= maths && maths <= 100)) {
            System.out.println("Invalid input, Marks should be between 0 to 100");
            System.out.println("\nPlease Enter correct Marks\t\t:");
            maths = sc.nextInt();
        }
        System.out.println("Enter the Marks of Science\t:\t ");
        int science = sc.nextInt();
        while (!(0 <= science && science <= 100)) {
            System.out.println("Invalid input, Marks should be between 0 to 100");
            System.out.println("Please Enter correct Marks\t\t: ");
            science = sc.nextInt();
        }
        System.out.println("Enter the Marks of English\t:\t ");
        int english = sc.nextInt();
        while (!(0 <= english && english <= 100)) {
            System.out.println("Invalid input, Marks should be between 0 to 100");
            System.out.println("Please Enter correct Marks\t\t:\t ");
            english = sc.nextInt();
        }

        int total;
        float percent;
        total = maths + science + english;
        percent = total / 3;
        String grade = "";
        String result = "";

        //if else statement
        if (percent >= 80) {
            grade = "A+";
            result = "Pass";
        } else if (percent >= 60) {
            grade = "A";
            result = "Pass";

        } else if (percent >= 50) {
            grade = "B";
            result = "Pass";
        } else if (percent >= 35) {
            grade = "C";
            result = "Pass";

        } else {
            result = "Fail";
        }
        //If statement
        if ((maths <= 34) || (science <= 34) || (english <= 34)) {
            result = "Fail";
        }


        //print statement
        System.out.println("|-------------------------------------|");
        System.out.println("|                                     |");
        System.out.println("|            Mark Sheet               |");
        System.out.println("|                                     |");
        System.out.println("|-------------------------------------|");
        System.out.println("|    Name:    " + name + " |");
        System.out.println("|    Roll No: " + roll + "|");
        System.out.println("|-------------------------------------|");
        System.out.println("|    Subject:    Marks                |");
        System.out.println("|-------------------------------------|");
        System.out.println("|    Math:    " + maths + "|" + "|");
        System.out.println("|    English: " + english + "|");
        System.out.println("|    Science: " + science + "|");
        System.out.println("|-------------------------------------|");
        System.out.println("|    Total:   " + total + "|");
        System.out.println("|-------------------------------------|");
        System.out.println("|    Percentage: " + percent + "|");
        System.out.println("| Result:     " + result + "|");
        System.out.println("| Grade:      " + grade + "|");
        System.out.println("|-------------------------------------|");
    }
}


