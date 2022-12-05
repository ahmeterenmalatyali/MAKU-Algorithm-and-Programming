/*
->Klavyeden girilen m ve n tamsayıları için dellanoy sayısını hesaplayan program
Adım 1:Başlat 
Adım 2:Klavyeden pozitif m ve n tamsayıları al
Adım 3:k=0,T=0
Adım 4:Eğer k>n ise git adım 10
Adım 5:C=n!/((n-k)!*k!)
Adım 6:T=T+(C^2*2^k)
Adım 7:k=k+1
Adım 8:Git adım 4
Adım 9:Yaz T
Adım 10:Bitir
*/
package homeworks;
import java.util.Scanner;
import java.lang.Math;
public class week8_homework50 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m;
        do {
            System.out.print("Lütfen m değerini giriniz: ");
            m=input.nextInt();
        } while (m<=0);
        int n;
        do {
            System.out.print("Lütfen n değerini giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        double T=0;
        for (int k = 0; k <= n; k++) {
            double c1=1;
            for (int i = 1; i <= n; i++) {
                c1=c1*i;
            }
            double c2=1;
            if (k==n) {}
            else{
                for (int i = 1; i <= n-k; i++) {
                c2=c2*i;
                }
            }
            double c3=1;
            if (k==0) {}
            else{
                for (int i = 1; i <= k; i++) {
                c3=c3*i;
                }
            }
            double C=Math.pow(c1 /(c2*c3),2);
            double S=Math.pow(2,k)*C;
            T+=(double)S;
        }
        System.out.println("D("+m+","+n+")="+(int)T);
    }
    
}