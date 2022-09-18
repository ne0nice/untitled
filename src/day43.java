public class day43 {
    public static void main(String[] args) {
        int[] numders = new int[9];
        for (int i = 0; i < numders.length; i++) {
            numders[i] = i + 1;
        }
        for (int i = 0; i < numders.length; i++) {
            if (numders[i] == 6)
                System.out.println("Порядкоывый номер " + i + ": " + numders[i]);

        }
    }
}

