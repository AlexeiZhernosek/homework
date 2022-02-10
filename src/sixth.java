import java.util.Scanner;

public class sixth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Большее число из введенных - " + a);
        } else {
            System.out.println("Большее число из введенных - " + b);
        }
    }
}
