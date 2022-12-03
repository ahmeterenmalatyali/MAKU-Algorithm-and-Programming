/*
->Klavyeden girilen pozitif tamsayının aritmetik sayı olup olmadığını bulan program
Aritmetik sayı: sayının tam bölenlerinin ortalaması tam sayı olan sayılar
Adım 1:Başlat
Adım 2:Klavyeden pozitif tamsayı(n) al
Adım 3:i=1,T=0,s=0
Adım 4:Eğer i>n ise git adım 8
Adım 5:Eğer n%i=0 ise T=T+i ve s=s+1
Adım 6:i=i+1
Adım 7:Git adım 4
Adım 8:B=T/s
Adım 9:Eğer B%1=0 ise yaz aritmetik sayıdır
Adım 10:Aksi taktirde yaz aritmetik sayı değildir
Adım 11:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework37 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen pozitif bir tamsayı giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        int T=0;
        int s=0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                T=T+i;
                s=s+1;
            }
        }
        double B=T/s;
        if (B%1==0) {
            System.out.println(+n+" aritmetik sayıdır.");
        }
        else{
            System.out.println(+n+" aritmetik sayı değildir.");
        }
    }
    
}
