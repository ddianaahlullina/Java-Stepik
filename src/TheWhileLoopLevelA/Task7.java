package TheWhileLoopLevelA;

import java.util.Scanner;

public class Task7 {
    //Программа запрашивает два числа: n и x.
    // Необходимо составить программу, которая будет прибавлять число x
    // само к себедо тех пор, пока сумма не станет больше либо равна n.
    // Выведите полученную сумму.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int sum = x;
        while (sum < n) {
            sum += x;
        }
        System.out.println(sum);
    }
}
