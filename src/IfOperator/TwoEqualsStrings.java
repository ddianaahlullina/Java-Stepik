package IfOperator;

import java.util.Scanner;

public class TwoEqualsStrings {
    /* С клавиатуры построчно вводятся три строки.
     Если среди них есть ровно две равные строки то вывести "Yes", в противном случае - "No".
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.next();
        String secondString = scanner.next();
        String thirdString = scanner.next();
        if (firstString.equals(secondString) && !firstString.equals(thirdString)) { // 1==2 1!=3
            System.out.println("Yes");
        } else if (secondString.equals(thirdString) && !secondString.equals(firstString)) { //2==3 2!=1
            System.out.println("Yes");
        } else if (thirdString.equals(firstString) && !thirdString.equals(secondString)) { // 3==1 3!=2
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
