package IfOperator;

import java.util.Scanner;

public class RedHat {
    public static void main(String[] args) {
        /*Вводится одно четное число - количество пирожков, которые испекла мама.
          Программа должна вывести  одно число - количество пирожков, которые Красная Шапочка
           сможет донести до бабушки.
         */
        Scanner scanner = new Scanner(System.in);
        int countOfPies = scanner.nextInt();
        int countOfPiesAfterWolf = countOfPies / 2;
        int countOfPiesAfterHunter = countOfPies - 10;
        if (countOfPies <= 12) {
            System.out.println(countOfPiesAfterWolf);
        } else {
            System.out.println(countOfPiesAfterHunter);
        }
    }
}
