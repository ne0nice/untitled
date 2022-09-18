import java.util.Scanner;

public class day7 {

    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner111 = new Scanner(System.in);
        int a = scanner111.nextInt();
        int b = scanner111.nextInt();
        int c = scanner111.nextInt();

        boolean ddd = (a < b+c && b < a+c && c < b+a);
        if (ddd) {
            System.out.println(TRIANGLE_EXISTS);
        }
            else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }



    }
}