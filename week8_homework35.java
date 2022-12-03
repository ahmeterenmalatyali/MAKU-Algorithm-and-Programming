/*
->Klavyeden girilen pozitif tamsayının ore sayısı olup olmadığını bulan program
Ore sayısı:tam bölenlerinin harmonik ortalaması tamsayı olan sayılar
Harmonik ortalama:1,2,4,7,14,28 için 6/((1/1)+(1/2)+(1/4)+(1/7)+(1/14)+(1/28))=3
Adım 1:Başlat 
Adım 2:Klavyeden pozitif tamsayı(n) al
Adım 3:i=1,T=0,s=0
Adım 4:Eğer i>n ise git adım 8
Adım 5:Eğer n%i=0 ise T=T+(1/i) ve s=s+1
Adım 6:i=i+1
Adım 7:Git adım 4
Adım 8:B=s/T
Adım 9:Eğer B%1=0 ise yaz ore sayısıdır
Adım 10:Aksi taktirde yaz ore sayısı değildir
Adım 11:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework35 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen pozitif bir tamsayı giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        int s=0;
        int T=0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                T=T+(1/i);
                s=s+1;
            }
        }
        double B=s/T;
        if (B%1==0) {
            System.out.println(+n+" ore sayısıdır.");
        }
        else{
            System.out.println(+n+" ore sayısı değildir.");
        }
    }
    
}
