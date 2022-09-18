import java.util.Scanner;
    public class day14 {
        public static String secret = "AmIGo";

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String login = scanner.nextLine();
            String result = login.equals(secret) ? "доступ разрешен" : "доступ запрещен";
            System.out.println(result);

            /* решение на и if
            выше вариент сранения на одной строке - Тернарный оператор

            Scanner scanner = new Scanner(System.in);
            String login = scanner.nextLine();
            if (login.equalsIgnoreCase(secret))
            System.out.println("доступ разрешен");
            else
            System.out.println("доступ запрещен");

             */
        }
    }
