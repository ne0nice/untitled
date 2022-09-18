import java.util.Scanner;
/*
Для решения этой задачи нужно:
Ввести с клавиатуры положительное целое число radius. Это будет радиус окружности.
Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.
Результатом должно стать целое число (тип int). Для этого нужно привести к типу int результат умножения (отбросить дробную часть, округлив вниз до целого числа).
В качестве значения pi используй 3.14.
*/
    public class day32 {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            int radius = console.nextInt();
            double pi = 3.14;
            int s = (int)(pi * radius * radius);
            System.out.println(s);

        }
    }
