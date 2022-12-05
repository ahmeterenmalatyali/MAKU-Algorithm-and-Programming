/*
->e= 0 dan n e kadar (2*k+2)/(2k+1)!
 */
import java.util.Scanner;
public class week9_example3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen n sayısını giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        double T=0;
        for (int i = 0; i <= n; i++) {
            int s=2*i+1;
            int C=1;
            for (int j = 1; j <= s; j++) {
                C=C*j;
            }
            T+=(double)(2*i+2)/C;
        }
        System.out.println("e="+T);
    }
    
}
