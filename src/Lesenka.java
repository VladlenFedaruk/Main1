import java.util.Scanner;

public class Lesenka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите число");
        int Les = scanner.nextInt();
        int Les1 = Les;
        for (int i = 1; i <= Les; i++) {
            Les1--;
            for (int j = 1; j <= (Les1); j++) {
                System.out.print("#");
            }
            System.out.println("#");
        }
    }
}