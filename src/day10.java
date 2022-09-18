import java.util.Scanner;
/*
Ищем максимум
*/
public class day10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numberA = scanner.nextInt();
            int numberB = scanner.nextInt();
            int number = numberA > numberB ? numberA : numberB;
            /*if (numberA > numberB) {
                System.out.println(numberA);
            } else {
             */
                System.out.println(number);
            }
        }


