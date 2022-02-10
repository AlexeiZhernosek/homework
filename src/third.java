import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println("Результат: " + (a + 1));
        } else if (a < 0) {
            System.out.println("Результат: " + (a - 2));
        } else {
            System.out.println("Результат: " + (a = 10));
        }
    }
}
