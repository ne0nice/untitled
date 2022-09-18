import java.util.Scanner;

public class day8 {

        public static void main(String[] args) {
            //напишите тут ваш код
            Scanner scanner111 = new Scanner(System.in);
            int x = scanner111.nextInt();
            int y = scanner111.nextInt();
            if (x > 0 && y > 0)
                System.out.println("1");
            else if (x < 0 && y > 0)
                System.out.println("2");
            else if (x < 0 && y < 0)
                System.out.println("3");
            else if (x > 0 && y < 0)
                System.out.println("4");

        }
    }
