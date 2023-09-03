import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите делимое: ");
        double firstValue = scanner.nextDouble();
        System.out.print("Введите делитель: ");
        double secondValue = scanner.nextDouble();
        try {
            System.out.println(calculate(firstValue, secondValue));
            scanner.close();
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    private static double calculate(double value1, double value2) throws DivisionByZeroException {
        if (value2 == 0) throw new DivisionByZeroException("Деление на ноль недопустимо!");
        return value1 / value2;
    }
}