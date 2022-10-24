package TernaryOperator;

import java.util.Scanner;

public class Cows {
    /* Дано число n (n<100).
       Программа должна вывести введенное число n и одно из слов:
       коров, корова или коровы, например, 1 корова, 2 коровы, 5 коров.
       Между числом и словом должен стоять ровно один пробел.
       Input: 3 Output: 3 коровы
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 100) {
            if (n % 10 == 1 && n != 11) {
                System.out.println(n + " корова");
            } else if (n % 10 >= 2 && n % 10 <= 4 && n / 10 != 1) { // n%10 - последняя цифра n/10 первая
                System.out.println(n + " коровы");
            } else if (n >= 5 && n <= 100) {
                System.out.println(n + " коров");
            }
        } else {
            System.out.println("Invalid number");
        }
    }
}
