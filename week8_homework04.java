/*
->cos(x)=1-(x^2)/2!+(x^4)/4!-(x^6)/6!-...+((-1)^N)*(x^2N)/(2N)!
Adım 1:Başlat
Adım 2:Klavyeden x ve terim sayısını(N) al(N>0)
Adım 3:T=1,k=1
Adım 4:Eğer k=>N ise git adım 13
Adım 5:i=1,C=1
Adım 6:Eğer i>k*2 ise git adım 10
Adım 7:C=C*i
Adım 8:i=i+1
Adım 9:Git adım 6
Adım 10:T=T+((-1)^k)*x^(2*k))/C
Adım 11:k=k+1
Adım 12:Git adım 4
Adım 13:Yaz T
Adım 14:Bitir
 */
package homeworks;
import java.util.Scanner;
import java.lang.Math;
public class week8_homework04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen x sayısını giriniz: ");
        int x=input.nextInt();
        int N;
        do {
            System.out.print("Lütfen terim sayısını giriniz: ");
            N=input.nextInt();
        } while (N<=0 || N%1!=0);
        double T=1;
        for (int k = 1; k < N; k++) {
            int C=1;
            for (int i = 1; i <= k*2; i++) {
                C=C*i;
            }
            double a=Math.pow(-1,k);
            double b=Math.pow(x,2*k);
            T=T+(a*b)/C;
        }
        System.out.println("cos("+x+")="+T);
    }
    
}
