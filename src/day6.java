import java.util.Scanner;
    public class day6 {
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            int age = scanner.nextInt();
            boolean work = (age < 20 || age > 65);
            if (work)
            System.out.println("можно не работать");
        }
    }


