package TheLoopWhile;

import java.util.Scanner;

public class EvenNumbers {
    // Вводятся целые числа a и b. Гарантируется, что a не превосходит b.
    // Выведите все четные числа от a до b (включительно).
    // Input 1 9 Output 2 4 6 8
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int evenNumbers = 0;
        while (firstNumber <= secondNumber) {
            if (firstNumber % 2 == 0) {
                System.out.println(firstNumber);
            }
            firstNumber++;
        }
    }
}
