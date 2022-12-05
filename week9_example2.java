/*
->4/(0 dan n e kadar (-1)^n/(2*n+1) toplamı)
 */
import java.util.Scanner;
import java.lang.Math;
public class week9_example2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen n sayısını giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        double T=0;
        for (int i = 0; i <= n; i++) {
            double x=Math.pow(-1, i);
            T+=(double)x/(2*i+1);
        }
        System.out.println(4*T);
    }
    
}
