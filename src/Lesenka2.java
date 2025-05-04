import java.util.Scanner;

public class Lesenka2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число N");
        int n = scanner.nextInt();
        lesenka(n);}
        public static int lesenka(int n){
            System.out.println();
            if (n<1)
                return 1 ;
            else {
                for (int i=1; i<=n; i++){
                System.out.print("#");
                }
                return lesenka(n-1);

            }
        }
        }



