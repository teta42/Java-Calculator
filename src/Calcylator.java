import java.util.Scanner;

public class Calcylator {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Получаем данные от пользователя
        Object[] userData = get_user_data(scanner); // Получаем массив с данными
        int num1 = (int) userData[0];
        int num2 = (int) userData[1];
        String oper = (String) userData[2];

        // Вычисляем результат
        result(oper, num1, num2);

        // Закрываем сканер
        scanner.close();
    }

    private static Object[] get_user_data(Scanner scanner) {
        // Запрашиваем у пользователя ввод
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();
        scanner.nextLine(); // Считываем оставшийся символ новой строки

        System.out.print("Введите операцию: + - / * \n");
        String oper = scanner.nextLine();

        return new Object[]{number1, number2, oper}; // Возвращаем массив
    }

    private static void result(String oper, int number1, int number2) {
        switch (oper) {
            case "+":
                System.out.println("Результат: " + (number1 + number2));
                break;

            case "-":
                System.out.println("Результат: " + (number1 - number2));
                break;

            case "*":
                System.out.println("Результат: " + (number1 * number2));
                break;

            case "/":
                if (number2 != 0) {
                    System.out.println("Результат: " + (number1 / number2));
                } else {
                    System.out.println("Ошибка: произошло деление на ноль");
                }
                break;

            default:
                System.out.println("Неверная операция: " + oper);
                break;
        }
    }
}