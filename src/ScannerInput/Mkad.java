package ScannerInput;

import java.util.Scanner;

public class Mkad {
    //Программа должна вывести целое число от 0 до 108 — номер отметки, на которой остановится Вася.
 public static void main( String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Input your speed (v)");
     int speed = scanner.nextInt();
     System.out.println("Input your time (t)");
     int time = scanner.nextInt();
     int distance = speed * time;
     int distanceCovered = distance % 109;
     System.out.println(distanceCovered);
 }
}
