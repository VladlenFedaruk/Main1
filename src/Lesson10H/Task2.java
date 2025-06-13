package Lesson10H;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("введите ваш возраст");
        int yearOld = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            yearOld = scanner.nextInt();
            yearOldMet(yearOld);

        } catch (CustomException e) {
            System.out.println("малыш, этот контент не для тебя");
        } catch (InputMismatchException e) {
            System.out.println("неверно введен возраст");
        }

    }

    private static void yearOldMet(int yearOld) throws CustomException {
        if (yearOld<18){
            throw new CustomException("error");
        }
        else {
            System.out.println("наслаждайтесь просмотром");
        }
    }
}
