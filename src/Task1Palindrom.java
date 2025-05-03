import java.util.Scanner;

public class Task1Palindrom {
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("ВВедите число больше 10");
      int palindrom = scanner.nextInt();
      if (palindrom<11){
          System.out.println("вы ввели число меньше 11 и оно не может являться палиндромом");
      }
      else{
          int k = 0;
          int palindrom2 = 0;
          int palindrom3 = palindrom ;;
          while (k!=1){
             palindrom2 = (palindrom2*10) + (palindrom3 % 10);
             palindrom3 = palindrom3/10;
             //System.out.println(palindrom2 + "    " + palindrom3 );
             if (palindrom3<1){
                 k = 1;
             }
          }
          if (palindrom2==palindrom)
              System.out.println("число является палиндромом");
              else
              System.out.println("число не является палиндромом");
                }
  }
}
