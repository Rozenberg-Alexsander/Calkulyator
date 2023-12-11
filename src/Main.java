import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double operand1 = scanner.nextDouble();

        System.out.println("Действие: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        System.out.println("Введите число: ");
        double operand2 = scanner.nextDouble();

        double result;

        switch (action) {
            case "+":
                result = operand1 + operand2;
                System.out.println(result);
                break;

            case "-":
                result = operand1 - operand2;
                System.out.println(result);
                break;

            case "*":
                result = operand1 * operand2;
                System.out.println(result);
                break;

            case "/":
                if (operand2 == 0)
                    System.out.println("Error");
                else {
                    result = operand1 / operand2;
                    System.out.println(result);
                }
                break;

            case "√":
                result = Math.sqrt(operand1);
                System.out.println(result);
                break;

            case "%":
                result = operand1 % operand2;
                System.out.println(result);
                break;

            default:
                System.out.println("Неверный ввод");
        }

    }
}