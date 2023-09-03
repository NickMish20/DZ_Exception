import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число больше ноля: ");
        try {
            System.out.println(validNumber(scanner.nextInt()));
            scanner.close();
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    private static String validNumber(int number) throws InvalidNumberException {
        if (number <= 0) throw new InvalidNumberException("Некорректное число");
        return "Число корректно";
        
    }
}