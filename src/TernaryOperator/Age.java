package TernaryOperator;

import java.util.Scanner;

public class Age {
    /*Вася приехал в Америку и он оооооочень любит кофе.
      В Америке приобрести этот напиток можно лишь лицам достигшим  возраста 21 год.
      Напишите программу, которая считает возраст Васи и выведет ответ ("Да"/"Нет") на вопрос: попьёт ли Вася сегодня кофе?
     Input : 18 Output : Нет
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 21) {
            System.out.println("Нет");
        } else {
            System.out.println("Да");
        }
    }
}
