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
        int priceItemInBill = bill * count;
        int priceItemInCoinToBill = (coin * count) / 100;
        int priceItemInCoin = (coin * count) % 100;
        System.out.println(priceItemInBill + priceItemInCoinToBill + " " + priceItemInCoin);

    }
}
