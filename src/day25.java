public class day25 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i < 100) {
            i++;
            if ((i % 3) == 0)
                continue;
            sum = sum + i;}
            System.out.println(sum);
        }
    }




/*
int i = 0;
        while (i < 100) {
            i++;
            if ( (i % 7) == 0)
                continue;
            System.out.println(i);
        }
    }
}
 */
