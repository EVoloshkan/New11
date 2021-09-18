import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        double a = scanner.nextDouble();
        String stringA = Double.toString(a);
        System.out.println("Введите число b");
        double b = scanner.nextDouble();
        int intB = (int) b;
        int intA = (int) Double.parseDouble(stringA);
        System.out.println("Максимальное число: " + Math.max(intA, intB));
        // Второй вариант трактовки пункта 3
        System.out.println("Максимальное число: " + Math.max(a, b));
        System.out.println("Минимальное число: " + (double) Math.min(intA, intB));
    }
}
