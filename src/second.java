public class second {
    public static void main(String[] args){
        int a = 6;
        int b = 2;
        int c = 3;
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
