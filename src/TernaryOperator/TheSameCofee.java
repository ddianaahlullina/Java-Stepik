package TernaryOperator;

import java.util.Scanner;

public class TheSameCofee {
    /*Решите первую задачу из этого урока, используя тернарный оператор.
      Условие:
      Вася приехал в Америку и он оооооочень любит кофе.
      В Америке приобрести этот напиток можно лишь лицам достигшим  возраста 21 год.
      Напишите программу, которая считает возраст Васи и выведет ответ ("Да"/"Нет")
      на вопрос: попьёт ли Вася сегодня кофе?
      variable = (condition) ? expressionTrue :  expressionFalse;
     Input: 18 Output : Нет
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println(age > 18 ? "Да" : "Нет");
    }
}
