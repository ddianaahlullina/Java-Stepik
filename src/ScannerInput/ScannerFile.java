package ScannerInput;

import java.util.Scanner;

public class ScannerFile {
    public static void main(String[] args) {
        //Напишите программу, которая считывает три целых числа и выводит их произведение.
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        System.out.println(firstNumber*secondNumber*thirdNumber);
    }
}
