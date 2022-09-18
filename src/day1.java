import java.util.Scanner;
    public class day1 {
        public static void main(String[] args) {
            String militaryCommissar = ", явитесь в военкомат";

            System.out.print ("Введите ваше имя: ");
            Scanner keyboard1 = new Scanner(System.in);
            String name = keyboard1.nextLine();

            System.out.print ("Введите ваш возраст: ");
            Scanner keyboard2 = new Scanner(System.in);
            int age = keyboard2.nextInt();
            if (age >= 18 && age <= 28)
                System.out.println(name + militaryCommissar);
            else
                System.out.print("");
            //Scanner.close();


            //Scanner keyboard = new Scanner(System.in);
           // String name = keyboard.nextLine();
            //int age = keyboard.nextInt();
        }
    }