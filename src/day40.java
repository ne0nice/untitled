public class day40 {
        public static void main(String[] args) {
            int [] i = new int[10];
            i [0] = 4;
            i [1] = 2;
            i [2] = 5;
            i [3] = i [1] * i [2];
            int [] q = new int[10];
            q [1] = 2;
            q [2] = i [2] * q [1];
            System.out.println(q[2]);
        }
    }

