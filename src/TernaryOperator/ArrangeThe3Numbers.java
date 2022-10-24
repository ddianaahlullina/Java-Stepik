package TernaryOperator;

import java.util.Scanner;

public class ArrangeThe3Numbers {
    /* Дано три числа, записанный в отдельных строках.
       Упорядочите их в порядке неубывания.
       Программа должна считывать три числа a, b, c,
       затем программа должна менять их значения так,
       чтобы стали выполнены условия a <= b <= c,
       затем программа выводит тройку a, b, c.
       Входные данные
       Вводятся три числа, каждое записано в отдельной строке.
       Выходные данные
       Выведите ответ на задачу.
       Input : 2 6 -4 Output: -4 2 6
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = a + b + c;
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int mid = sum - max - min;
        System.out.println(min + " " + mid + " " + max);
    }
}
