package ScannerInput;

import java.util.Scanner;

public class CostOfShopping {
   /* Пирожок в столовой стоит a рублей и b копеек.
      Определите, сколько рублей и копеек нужно заплатить за n пирожков.
   */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bill = scanner.nextInt();
        int coin = scanner.nextInt();
        int count = scanner.nextInt();
        System.out.println((bill * count) + (coin * count) / 100 + " " + (coin * count) % 100);

    }
}