package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип чисел:");
        System.out.println("1. Рациональные числа");
        System.out.println("2. Комплексные числа");

        int choice = scanner.nextInt();

        if (choice == 1) {
            handleRationalNumbers(scanner);
        } else if (choice == 2) {
            handleComplexNumbers(scanner);
        } else {
            System.out.println("Некорректный выбор.");
        }
    }

    private static void handleRationalNumbers(Scanner scanner) {
        System.out.println("Введите первое рациональное число в формате (числитель/знаменатель):");
        RationalNumber num1 = RationalNumber.parseRationalNumber(scanner.next());

        System.out.println("Введите второе рациональное число в формате (числитель/знаменатель):");
        RationalNumber num2 = RationalNumber.parseRationalNumber(scanner.next());

        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");

        int operation = scanner.nextInt();

        RationalNumber result = null;

        switch (operation) {
            case 1:
                result = num1.add(num2);
                break;
            case 2:
                result = num1.subtract(num2);
                break;
            case 3:
                result = num1.multiply(num2);
                break;
            case 4:
                result = num1.divide(num2);
                break;
            default:
                System.out.println("Некорректный выбор операции.");
                return;
        }

        System.out.println("Результат: " + result);
    }

    private static void handleComplexNumbers(Scanner scanner) {
        System.out.println("Введите первое комплексное число в формате (a+bi):");
        ComplexNumber num1 = ComplexNumber.parseComplexNumber(scanner.next());

        System.out.println("Введите второе комплексное число в формате (a+bi):");
        ComplexNumber num2 = ComplexNumber.parseComplexNumber(scanner.next());

        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");

        int operation = scanner.nextInt();

        ComplexNumber result = null;

        switch (operation) {
            case 1:
                result = num1.add(num2);
                break;
            case 2:
                result = num1.subtract(num2);
                break;
            case 3:
                result = num1.multiply(num2);
                break;
            case 4:
                result = num1.divide(num2);
                break;
            default:
                System.out.println("Некорректный выбор операции.");
                return;
        }

        System.out.println("Результат: " + result);
    }
}
