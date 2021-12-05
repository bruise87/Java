package Task3;

import java.util.Scanner;

public class Task3 {
    public static void Task3() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = reader.nextInt();
        System.out.print("Введите символ операции(+,-,*,/):  ");
        char operator = reader.next().charAt(0);
        System.out.print("Введите второе число: ");
        int num2 = reader.nextInt();
        Calculator calculator = new Calculator();
        int result = calculator.calculate(num1, num2, operator);
        System.out.println("Результат = " + result);

    }
}
