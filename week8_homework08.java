/*
->e=2+4/3!+6/5!+...+(2*k+2)/(2*k+1)!
Adım 1:Başlat
Adım 2:Klavyeden terim sayısı(n) al
Adım 3:k=0,T=0
Adım 4:Eğer k=>n ise git adım 13
Adım 5:s=2k+1,C=1,i=1
Adım 6:Eğer i>s ise git adım 10
Adım 7:C=C*i
Adım 8:i=i+1
Adım 9:Git adım 6
Adım 10:T=T+(2*k+2)/C
Adım 11:k=k+1
Adım 12:Git adım 4
Adım 13:Yaz T
Adım 14:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework08 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen terim sayısını giriniz: ");
            n=input.nextInt();
        } while (n<=0 || n%1!=0);
        double T=0;
        for (int k = 0; k < n; k++) {
            int s=2*k+1;
            int C=1;
            for (int i = 1; i <= s; i++) {
                C=C*i;
            }
            T+=(double)(2*k+2)/C;
        }
        System.out.println("e="+T);
    }
    
}
