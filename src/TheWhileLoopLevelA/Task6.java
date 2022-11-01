package TheWhileLoopLevelA;

import java.util.Scanner;

public class Task6 {
    //Пользователь вводит натуральные числа по одному на каждой строке.
    // Когда ему надоедает, то он вводит 0.
    // Найти сумму введенных чисел (0 не считается)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int i = 0;
        while (inputNumber != 0) {
            i += inputNumber;
            inputNumber = scanner.nextInt();
        }
        System.out.println(i);
    }
}
