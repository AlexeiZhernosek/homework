public class first {
    public static void main(String[] args) {
        int a = -2000;
        int countOfNumbers = 0;
        for (int i = a ; i != 0; i = i / 10)
            countOfNumbers =countOfNumbers + 1;
        if (countOfNumbers == 1){
            System.out.print("Это однозначное ");
            if (a > 0 ) {
                System.out.print("положительное число");
            } else {
                System.out.println("отрицательное число");
            }
        } else if (countOfNumbers == 2){
            System.out.print("Это двухзначное ");
            if (a > 0 ) {
                System.out.print("положительное число");
            } else {
                System.out.println("отрицательное число");
            }
        }else if (countOfNumbers == 3){
            System.out.print("Это трехзначное ");
            if (a > 0 ) {
                System.out.print("положительное число");
            } else {
                System.out.println("отрицательное число");
            }
        }else if (countOfNumbers == 4){
            System.out.print("Это четырехзначное ");
            if (a > 0 ) {
                System.out.print("положительное число");
            } else {
                System.out.println("отрицательное число");
            }
        }
    }
}
