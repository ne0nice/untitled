import java.util.Scanner;

public class day5 {

        public static void main(String[] args) {

            Scanner scanner111 = new Scanner(System.in);
            int a = scanner111.nextInt();
            int b = scanner111.nextInt();
            int c = scanner111.nextInt();
            if (a == b && b == c)
                System.out.println(a + " " + b + " " + c);
            else if (a == b)
            System.out.println(a + " " + b);
            else if (b == c)
            System.out.println(b + " " + c);
            else if (a == c)
            System.out.println(a + " " + c);


        }
    }


