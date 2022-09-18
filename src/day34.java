import java.util.Scanner;
/*
Скорость ветра
*/
    public class day34 {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            double wind = console.nextDouble();
            double speed = wind * 3.6;
            int speed2 =(int) Math.round(speed);
            System.out.println(speed2);

        }
    }
/*
сначала создаём scanner потом int ms
потом double kmh = ms * 3.6
потом int s = (int) Math.round(kmh) ;
System.out.println(s)
 */