/*
->1 den n e kadar i/i! toplamı
 */
import java.util.Scanner;
public class week9_example1 {
public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen terim sayısını giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        double T=0;
        for (int i = 1; i <= n; i++) {
            int F=1;
            for (int j = 1; j <= i; j++) {
                F=F*j;
            }
            T+=(double)i/F;   
        }
        System.out.println(T);
    }
    
}
