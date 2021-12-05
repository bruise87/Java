package Task3;

public class Calculator {
    public int calculate(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = summ(num1, num2);
                break;
            case '-':
                result = diff(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = deviate(num1, num2);
                break;
            default:
                System.out.println("Ты шо, ебобо?");
        }
        return result;
    }

    public int summ(int num1, int num2) {
        return num1 + num2;
    }

    public int diff(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int deviate(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("На ноль делить нельзя");
            return 0;
        } else return num1 / num2;

    }
}