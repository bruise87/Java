package Task1;
import java.util.Scanner;

public class Task1 {
    public static void Task1() {
        int minNum;
        int result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ваше первое число: ");
        int x = scan.nextInt();
        System.out.println("Ваше второе число: ");
        int c = scan.nextInt();
        if (x < c) {
            minNum = x;
            System.out.println("Первое число минимальное " + x);
        } else if (x > c) {
            minNum = c;
            System.out.println("Второе число минимальное " + c);
        } else {
            minNum = c;
        }
        for (int i = 1; i <= minNum; i++) {
            result += i;
        }
        System.out.println(result);

    }
}
