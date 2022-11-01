package TheWhileLoopLevelA;

import java.util.Scanner;

public class Task5 {
    // Пользователь вводит натуральные числа по одному на каждой строке.
    // Когда ему надоедает, то он вводит 0.
    // Найти количество введенных чисел (0 не считается)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int i = 0;
        while (inputNumber != 0) {
            inputNumber = scanner.nextInt();
            i++;
        }
        System.out.println(i);
    }
}
