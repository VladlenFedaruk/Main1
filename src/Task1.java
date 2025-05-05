import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = scanner.nextLine();
        StringBuilder resalt = new StringBuilder();
        int countSymbol = text.length();
        for (int i = 0; i < countSymbol; i++) {
            char symbol = text.charAt(i);
            if ((symbol >= 'a') && (symbol <= 'z')) {
                symbol = (char) (symbol - 32);
            }
            resalt.append(symbol);

        }
        System.out.println(resalt);
    }
}

