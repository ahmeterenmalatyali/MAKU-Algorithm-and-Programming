/*
->Klavyeden girilen m ve n değerleri için E(m,n) "Eulerian sayısını" hesaplayan program
Eulerian sayısı:E(m,n)=i:0 dan n e kadar (-1)^î* kombinasyon(m+1,i)*(n+1-i)^m
Adım 1:Başlat
Adım 2:Klavyeden n ve m değerlerini al
Adım 3:i=0,T=0
Adım 4:Eğer i>n ise git adım 26
Adım 5:j=1,C1=1
Adım 6:Eğer j>m+1 ise git adım 10
Adım 7:C1=C1*j
Adım 8:j=j+1
Adım 9:Git adım 6
Adım 10:k=1,C2=1
Adım 11:Eğer m+1=i ise C2=C2
Adım 12:Aksi taktirde eğer k>m+1-i ise git adım 16
Adım 13:C2=C2*k
Adım 14:k=k+1
Adım 15:Git adım 12
Adım 16:l=1,C3=1
Adım 17:Eğer i=0 ise C3=C3
Adım 18:Aksi taktirde eğer l>i ise git adım 22
Adım 19:C3=C3*l
Adım 20:l=l+1
Adım 21:Git adım 18
Adım 22:kom=C1/(C2*C3)
Adım 23:T=T+(-1)^î*kom*(n+1-i)^m
Adım 24:i=i+1
Adım 25:Git adım 4
Adım 26:Yaz T
Adım 27:Bitir
 */
package homeworks;
import java.lang.Math;
import java.util.Scanner;
public class week8_homework40 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m;
        int n;
        do {
            System.out.print("Lütfen m değerini giriniz: ");
            m=input.nextInt();
        } while (m<=0);
        do {
            System.out.print("Lütfen n değerini giriniz(m>n): ");
            n=input.nextInt();
        } while (n<=0 || m<=n);
        double T=0;
        for (int i = 0; i <= n; i++) {
            int C1=1;
            for (int j = 1; j <= m+1; j++) {
                C1=C1*j;
            }
            int C2=1;
            if (m+1<=i) {}
            else{
                for (int k = 1; k <= m+1-i; k++) {
                    C2=C2*k;
                }
            }
            int C3=1;
            if (i<=0) {}
            else{
                for (int l = 1; l <= i; l++) {
                    C3=C3*l;
                }                
            }
            double kom=C1/(C2*C3);
            double x=Math.pow(-1,i);
            double y=Math.pow(n+1-i,m);
            T+=(double)x*kom*y;
        }
        System.out.println("E("+m+","+n+")="+T);
    }      
}
