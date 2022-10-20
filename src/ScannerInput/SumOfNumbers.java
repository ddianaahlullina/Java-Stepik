package ScannerInput;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        // Дано трехзначное число. Найдите сумму его цифр.
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int firstNumber = inputNumber / 100;//чтоб получить первое число
        int secondNumber = inputNumber / 10 % 10; // чтоб получить второе число
        int thirdNumber = inputNumber % 10; // чтоб получить последнее число
        int outputNumber = firstNumber + secondNumber + thirdNumber;
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        System.out.println(outputNumber);
    }
}

    /* e = n % 10;   операция n % 10   - вычисляет последнюю цифру числа n (то есть единицы числа)  365 % 10 = 5
    d = n / 10 % 10; операция n / 10 - сокращает число в 10 раз, то есть отбрасывает у числа последнюю цифру (365 / 10 = 36),
    теперь мы можем вычислить число десятков, применив к результату знакомую операцию - вычислить остаток от деления на число 10, 36 % 10 = 6
    s = n / 100;      чтобы получить сотни, достаточно у числа отбросить справа две цифры, то есть дважды разделить на 10  (n / 10 /10 или тоже самое, что n / 100) 365 / 100 = 3 */
