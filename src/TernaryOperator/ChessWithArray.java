package TernaryOperator;

import java.util.ArrayList;
import java.util.Scanner;
// Input: 2 2 2 5 Output : YES
public class ChessWithArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        while (arrayList.size() < 4) {
            int number = scanner.nextInt();
            if (number >= 1 && number <= 8) {
                arrayList.add(number);
            } else {
                System.out.println("Incorrect number " + number);
            }
            System.out.println(arrayList);
        }
        System.out.println(arrayList.get(0) == arrayList.get(2) || arrayList.get(1) == arrayList.get(3) ? "YES" : "NO");
    }
}
