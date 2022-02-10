public class seven {
    public static void main(String[] args){
        int b = 122;
        int a = b % 10;
        if (b < 0){
            System.out.println("Ошибка");
        } else if (b == 11 || b == 12 || b == 13 || b == 14){
            System.out.println(b + " программистов");
        } else if (a  == 1){
            System.out.println(b + " программист");
        } else if (a == 2 || a  == 3 || a  == 4){
            System.out.println(b + " программиста");
        } else if (a  == 0 || a  == 5 || a  == 6 || a  == 7 || a == 8 || a  == 9){
            System.out.println(b + " программистов");
        }
    }
}
