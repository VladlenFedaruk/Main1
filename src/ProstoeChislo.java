import java.util.Scanner;

public class ProstoeChislo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите простое число");
        int PrCh = scanner.nextInt();
        int PrCh1 = 2;
        int k = 0;
        int h = 0;
        if (PrCh > 1){
        while (k!=1){
            if ((PrCh%PrCh1!=0) && (PrCh1*2<PrCh))
                PrCh1++;
                else if (PrCh%PrCh1==0) { //((PrCh1!=1) && (PrCh1*2>PrCh) && (PrCh%PrCh1==0))
                    k=1;
                    h++;
                } else if  (PrCh1*2>PrCh)
                k=1;
                    }
        if (h!=0)
            System.out.println("число не является простым");
        else
            System.out.println("число простое");
        }
        else if (PrCh==1)
            System.out.println("число простое");

        else if (PrCh<1)
            System.out.println("число должно быть больше нуля");

    }
}
