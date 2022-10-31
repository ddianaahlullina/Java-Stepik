package TheLoopWhile;

import java.util.Scanner;

public class Squares {
    // Пользователь вводит натуральное число.
    // Необходимо вывести все полные квадраты натуральных чисел, не превосходящие этого числа.
    // Input : 17 Output : 1 4 9 16
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int b = 1;
        while (Math.pow(b, 2) <= number) {
            System.out.println((int) Math.pow(b, 2));
            b++;
        }
    }
}
