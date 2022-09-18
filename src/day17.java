import java.util.Scanner;

public class day17 {
        public static void main(String[] args) {
            String text = " любит меня.";
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int cikl = 0;
            while (cikl++ < 10)
                System.out.println(name + text);

        }
    }

