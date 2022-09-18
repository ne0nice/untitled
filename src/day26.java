import java.util.Scanner;

public class day26 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
