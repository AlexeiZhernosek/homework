import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        System.out.println("Введите число c");
        int c = scanner.nextInt();
        int x = 0;

        if (a > 0) {
            x = x + 1;
        }
        if (b > 0) {
            x = x + 1;
        }
        if (c > 0) {
            x = x + 1;
        }
        System.out.println("Количество положительных чисел " + x);
    }
}
