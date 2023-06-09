package javaFundamentals;
import java.util.Scanner;

/*
Algorithm:

1. Enter a season of the year.
2. Enter a whole number.
3. Enter an adjective.
4. Complete the sentence and output the results: "On a <adjective> <season of the year> day, I drink a minimum of <whole number> cups of coffee."
 */

public class MadLibs {

    public static void main(String[] args) {

        System.out.println("Enter a season of the year.");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Enter a whole number");
        int number = scanner.nextInt();

        System.out.println("Enter an adjective.");
        String adjective = scanner.next();
        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
    }
}
