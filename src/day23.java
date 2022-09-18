import java.util.Scanner;

public class day23 {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            while (true)
            {
                String s = console.nextLine();
                if (!s.equals("enough"))
                System.out.println(s);
                else if (s.equals("enough"))
                    break;
            }

        }
    }
/*
Scanner console = new Scanner(System.in);
while (true)
{
   String s = console.nextLine();
   if (s.equals("exit"))
     break;
}

 */