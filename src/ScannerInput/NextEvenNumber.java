package ScannerInput;

import java.util.Scanner;

public class NextEvenNumber {
    //Дано целое число n. Выведите следующее за ним четное число.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int outputNumber = inputNumber + 2 - inputNumber % 2;
        System.out.println(outputNumber);
    }
}
