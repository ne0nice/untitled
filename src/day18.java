import java.util.Scanner;

public class day18 {
    public static void main(String[] args) {
        // практически весь код дан в лекции  а насчет int sum=0 это инициализация переменой
// то есть мы выделяем ячейку памяти для нее, чтобы программа не работала с пустотой

// создаем экземпляр на основе  класса Scanner
        Scanner console = new Scanner(System.in);
// задаем булевую переменную взводим её на false как и было в лекции
        boolean isExit = false;
//инициализация переменой , то есть мы выделяем ячейку памяти
        int sum = 0;
//цикл while с 2мя условиями введено число с клавиатуры, и значение boolean не true
        while (console.hasNextInt() && !isExit) {
//переменная которая принимает число при вводе с клавиатуры
            int x = console.nextInt();
//переменная которая ждет строковое значение при вводе с клавиатуры
            String s = console.nextLine();
//переменную суммы суммируем с текущим значением x
            sum += x;
//здесь ждем что введут слово ENTER
            isExit = s.equals("ENTER");
        }
//выводим сумму на экран после выключения цикла while
        System.out.println(sum);

    }
}
