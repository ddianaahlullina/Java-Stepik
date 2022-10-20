package IfOperator;

import java.util.Scanner;

public class WhichNumberIsBigger {
    /*С клавиатуры вводятся два числа.
    Выведите на экран большее из них.
     */
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }
    }
}
