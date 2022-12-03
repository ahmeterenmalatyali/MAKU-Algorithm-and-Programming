/*
->sin(x)=x-(x^3)/3!+(x^5)/5!-(x^7)/7!+...+((-1)^(n-1)*x^(2n-1))/(2n-1)!
Adım 1:Başlat
Adım 2:Klavyeden terim sayısı(n) ve x sayısı al
Adım 3:T=0,k=1
Adım 4:Eğer k>n ise git adım ____
Adım 5:s=2k-1,i=1,C=1
Adım 6:Eğer i>s ise git adım 10
Adım 7:C=C*i
Adım 8:i=i+1
Adım 9:Git adım 6
Adım 10:T=T+((-1)^(k-1)*x^s)/C
Adım 11:Git adım 4
Adım 12:Yaz T
Adım 13:Bitir
 */
package homeworks;
import java.util.Scanner;

import java.lang.Math;
public class week8_homework03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("LÜtfen x i giriniz: ");
        int x=input.nextInt();
        int n;
        do {
            System.out.print("Lütfen terim sayısını giriniz: ");
            n=input.nextInt();
        } while (n<=0 || n%1!=0);
        double T=0;
        for (int k = 1; k <= n; k++) {
            int s=2*k-1;
            int C=1;
            for (int i = 1; i <= s; i++) {
                C=C*i;
            }
            double a=(double)Math.pow(-1,k-1);
            double b=(double)Math.pow(x,s);
            T+=(double)((a*b)/C);
        }
        System.out.println("sin("+x+")="+T);
    }
    
}
