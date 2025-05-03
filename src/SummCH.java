import java.util.Scanner;

public class SummCH {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите положительное число");
        int SumCh = scanner.nextInt();
        int k = 0;
        int j = 0;
        int Sum = 0;
        if (SumCh<10)
            System.out.println(SumCh);
        else{
            do {
                do{
                    //System.out.println(Sum + "   " + SumCh);
                    Sum=Sum+(SumCh%10);
                    SumCh=SumCh/10;
                    if  (SumCh<1)
                        j=1;
                }
                while (j!=1);
                SumCh=Sum;
                Sum=0;
                j=0;
                if (SumCh<10)
                    k=1;
            }
            while (k!=1);
            System.out.println(SumCh);
        }
        }
}
