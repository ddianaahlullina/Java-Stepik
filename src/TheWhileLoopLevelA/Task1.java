package TheWhileLoopLevelA;

import java.util.Scanner;

public class Task1 {
    //Вводится число натуральное число n.
    // Выведите на экран построчно все числа от 1 до n.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 1;
        while (count <= number) {
            System.out.println(count);
            count++;
        }
    }
}
