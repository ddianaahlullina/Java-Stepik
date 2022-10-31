package TheLoopWhile;

import java.util.Scanner;

public class Sum {
    //Вводится 2 целых числа a и b (a <= b).
    // Необходимо вычислить сумму всех чисел от а до b включительно.
    // Input : 1 3 Output : 6
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        while (a <= b) {
            sum += a;
            a++;
        }
        System.out.println(sum);
    }
}
