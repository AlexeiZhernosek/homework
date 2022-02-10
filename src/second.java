import java.util.Scanner;

public class second {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону a");
        int a = scanner.nextInt();
        System.out.println("Введите сторону b");
        int b = scanner.nextInt();
        System.out.println("Введите сторону c");
        int c = scanner.nextInt();
        if (a > b + c) {
            System.out.println("Треугольник существует");
        } else if (b > a + c) {
            System.out.println("Треугольник существует");
        } else if (c > a + b) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}
