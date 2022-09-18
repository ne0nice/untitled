import java.util.Scanner;
/*
Стакан наполовину пуст или наполовину полон?
*/
    public class day35 {
        public static void main(String[] args) {
            double glass = 0.5;
            Scanner console = new Scanner(System.in);
            boolean i = console.nextBoolean();
            if (i == true) {
                int x1 = (int) Math.ceil(glass);
                System.out.println(x1);
            }
            else if (i == false)  {
                int x2 = (int) Math.floor(glass);
                System.out.println(x2);
            }
        }
    }
    /*Scanner scanner = new Scanner(System.in);
    boolean a = scanner.nextBoolean();
System.out.println(a ? (int) Math.ceil(glass) : (int) Math.floor(glass));
*/

