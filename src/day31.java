import java.util.Scanner;
/*
В этой задаче нужно:
Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
Вывести на экран строку number раз с помощью цикла do-while. Каждое значение нужно вывести с новой строки.
Если число number меньше/равно 0 или больше/равно 5, то введенную строку нужно вывести на экран один раз.
 */
    public class day31 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        int number = console.nextInt();
        do {
            System.out.println(text);
            number--;
        }
        while (number > 0 & number < 4);
    }
}


    /*
вводим строку;
вводим число;
do{
выводим строку;
декремент числа;
} while(число>0 && число<4);
     */