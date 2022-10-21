package IfOperator;

import java.util.Scanner;

public class StrangeCases {
    public static void main(String[] args) {
        /* На вход даётся 3 целых числа: h, m - время, в которое
        Пете надо было проснуться, и x - время, которое показывают его часы.
        Выведите слово "Успел", если Петя не проспал,
        или "Опоздал", если Петя не смог проснуться вовремя.
         */
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int timeToWakeUp = scanner.nextInt();
        int hoursToMinutes = hours * 60;
        int timeInSeconds = (hoursToMinutes + minutes) * 60;
        if (timeInSeconds >= timeToWakeUp ) {
            System.out.println("Успел");
        } else {
            System.out.println("Опоздал");
        }
    }
}
