public class day22 {
    public static void main(String[] args) {
            int a=0;
            while(a<10){
                int b=0;
                if(a==0||a==9){
                    while(b<20){
                        System.out.print("Б");
                        b++;
                    }
                }else{
                    while(b<20){
                        if(b==0||b==19) System.out.print("Б");
                        else System.out.print(" ");
                        b++;
                    }
                }
                System.out.println(" ");
                a++;
            }
        }
    }