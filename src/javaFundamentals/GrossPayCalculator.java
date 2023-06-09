package javaFundamentals;
import java.util.Scanner;

/*
Problem Statement:

Calculate the gross pay of the employee using number of hours worked and hourly pay rate.
Gross Pay = hours * rate

Algorithm:
1. Get the number of hours worked.
2. Get the hourly pay rate.
3. Multiply the hours and pay rate.
4. Display the results.
 */

public class GrossPayCalculator {

    public static void main(String[] args) {

        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("Enter the employee's hourly pay rate.");
        double rate = scanner.nextDouble();

        double grossPay = hours * rate;

        System.out.println("The employee's gross pay is $" + grossPay);
    }
}
