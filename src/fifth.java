public class fifth {
    public static void main(String[] args){
        int a = 1;
        int b = -3;
        int c = 5;
        int x = 0;
        int y = 0;
        if (a > 0){
            x = x + 1;
        } else {
            y = y + 1;
        }
        if (b > 0){
            x = x + 1;
        } else {
            y = y + 1;
        }
        if (c > 0){
            x = x + 1;
        } else {
            y = y + 1;
        }
        System.out.println("Количество положительных чисел " + x);
        System.out.println("Количество отрицательных чисел " + y);
    }
}


