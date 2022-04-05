package calculate;
/**
 * 4. Write a “main” method into main class. It has scanner that takes user
 * input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective
 * for other symbol.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */
import java.util.Scanner;

public class Main extends Calculator {
    static char userAns;

    public static void main(String[] args) {

        try {
            Main obj = new Main();

            do {
                Scanner reader = new Scanner(System.in);
                System.out.println("Enter first number: ");
                obj.a = reader.nextInt();
                System.out.println(" Enter second number :");
                obj.b = reader.nextInt();
                System.out.println(" Please enter one of symbol + , -, *, / :");
                obj.symbol = reader.next().charAt(0);
                obj.calculateResult(obj.a, obj.b, obj.symbol);
                System.out.println("Would you like to do more calculation Please enter :  Y or N");
                userAns = reader.next().toLowerCase().charAt(0);
            } while (userAns == 'y');
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Please make sure your selection of value and operator is right !");
        }
    }
}