package IfOperator;

import java.util.Scanner;

public class BiggerNumberOfTheThree {
    public static void main(String[] args) {
        //Вводится 3 целых числа, выведите большее из них
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println(secondNumber);
        } else {
            System.out.println(thirdNumber);
        }
    }
}
