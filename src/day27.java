import java.util.Scanner;

    public class day27 {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            int min = Integer.MAX_VALUE;
            while (console.hasNextInt())
            {
                int x = console.nextInt();
                if (x < min)
                    min = x;
            }
            System.out.println(min);

        }
    }

