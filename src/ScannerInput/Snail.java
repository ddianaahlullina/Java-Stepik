package ScannerInput;

import java.util.Scanner;

public class Snail {
    /*Улитка ползёт по вертикальному шесту высотой high метров,
    поднимаясь за день на uphill метров, а за ночь спускаясь на downhill метров.
    На какой день улитка доползёт до вершины шеста? */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int high = scanner.nextInt();
        int uphill = scanner.nextInt();
        int downhill = scanner.nextInt();
        int distanceDown = high - downhill; // расстояние улитки вниз
        int commonDistance = uphill - downhill;// общее  пройденное расс
        int roundingDays = (distanceDown + commonDistance - 1);
        System.out.print(roundingDays / commonDistance);
    }
}
