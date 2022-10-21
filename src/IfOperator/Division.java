package IfOperator;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
       /*Напишите программу, которая считывает 2 действительных числа и выводит их частное.
       Если это невозможно, то выводит слово "Error"
        */
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        if (secondNumber != 0) {
            double answer = firstNumber / secondNumber;
            System.out.println(answer);
        } else {
            System.out.println("Error");
        }
    }
}
