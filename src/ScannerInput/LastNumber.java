package ScannerInput;

import java.util.Scanner;

public class LastNumber {
    public static void main (String[] args) {
        /*Дано произвольное положительное натуральное число.
          Найдите его последнюю цифру.
         */
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int lastNumber = inputNumber % 10;
        System.out.println(lastNumber);
    }
}
