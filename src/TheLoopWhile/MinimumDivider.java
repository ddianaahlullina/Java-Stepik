package TheLoopWhile;

import java.util.Scanner;

public class MinimumDivider {
    //Дано целое число, не меньшее 2.
    // Выведите его наименьший натуральный делитель, отличный от 1.
    // Input 15 Output 3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int divider = 2;
        while (inputNumber % divider != 0) {
            divider++;
        }
        System.out.println(divider);
    }
}
