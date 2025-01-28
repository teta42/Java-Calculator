import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calc calculator = new Calc();
        calculator.start();
    }
}

class Calc {
    Scanner scanner;
    int num1;
    int num2;
    String oper;

    public void start() {
        // Создаем объект Scanner для считывания ввода с консоли
        this.scanner = new Scanner(System.in);

        // Получаем данные от пользователя
        get_user_data();

        // Вычисляем результат
        result();

        // Закрываем сканер
        scanner.close();
    }

    private void get_user_data() {
        // Запрашиваем у пользователя ввод
        System.out.print("Введите первое число: ");
        this.num1 = this.scanner.nextInt();

        System.out.print("Введите второе число: ");
        this.num2 = this.scanner.nextInt();
        this.scanner.nextLine(); // Считываем оставшийся символ новой строки

        System.out.print("Введите операцию: + - / * \n");
        this.oper = this.scanner.nextLine();
    }

    private void result() {
        String result;
        switch (this.oper) {
            case "+":
                result = "Результат: " + (this.num1 + this.num2);
                System.out.println(result);
                break;

            case "-":
                System.out.println("Результат: " + (this.num1 - this.num2));
                break;

            case "*":
                System.out.println("Результат: " + (this.num1 * this.num2));
                break;

            case "/":
                if (this.num2 != 0) {
                    System.out.println("Результат: " + (this.num1 / this.num2));
                } else {
                    System.out.println("Ошибка: произошло деление на ноль");
                }
                break;

            default:
                System.out.println("Неверная операция: " + this.oper);
                break;
        }
    }
}