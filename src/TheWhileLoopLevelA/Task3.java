package TheWhileLoopLevelA;

import java.util.Scanner;

public class Task3 {
    // Вводятся два целых числа a и b.
    // Выведите на экран все числа от a до b включительно.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < b) {
            while (a <= b) {
                System.out.println(a);
                a++;
            }
        } else if (a > b) {
            while (a >= b) {
                System.out.println(a);
                a--;
            }
        } else if (a == b) {
            while (a == b) {
                System.out.println(b);
                b--;
            }
        }
    }
}

