package TheWhileLoopLevelA;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Вводятся два целых числа k (1 <= k <= 10) и n (0 <= n <= 100).
        // Выведите на экран построчно все числа кратные k от 1 до n включительно.
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int i = 1;
        if (k >= 1 && k <= 10 && n >= 0 && n <= 100) {
            while (i <= n) {
                if (i % k == 0) {
                    System.out.println(i);
                    i++;
                }
            }
        } else {
            System.out.println("1 <= k <= 10 and n 0 <= n <= 100");
        }
    }
}

