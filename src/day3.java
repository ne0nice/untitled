import java.util.Scanner;

public class day3 {

    public static void main(String[] args) {

        int age = 22;
        if (age <= 7)
                System.out.println("нужно ходить в садик");
        else if (age > 7 && age <= 18)
            System.out.println("пора в школу");
        else if (age > 18 && age <= 25)
            System.out.println("пора в институт");
        else if (age > 25 && age <= 65)
            System.out.println("пора на работу");
        else if (age > 65)
            System.out.println("пора на пенсию");
    }
}
