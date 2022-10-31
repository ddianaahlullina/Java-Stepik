package TheLoopWhile;

import java.util.Scanner;

public class SumFromNumber {
    //Дано натуральное число N.
    // Напишите програму, вычисляющую сумму цифр числа N.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int sum = 0;
        while (inputNumber > 0) {
            sum += inputNumber % 10;
            inputNumber /= 10;
        }
        System.out.println(sum);
    }
}
