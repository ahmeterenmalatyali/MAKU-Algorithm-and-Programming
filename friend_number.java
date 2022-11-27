/*
->Klavyeden girilen 2 tamsayının dost sayılar olup olmadığını bulan program
Dost Sayı:m ve n için m hariç m nin tüm tam bölenlerinin toplamı n ye eşit ise bunlar dost sayıdır
Adım 1:Başlat
Adım 2:Klavyeden m ve n pozitif tamsayısı al
Adım 3:i=1,j=1,T1=0,T2=0
Adım 4:Eğer i>=m ise git adım 8
Adım 5:Eğer m%i=0 ise T1=T1+i
Adım 6:i=i+1
Adım 7:Git adım 4
Adım 8:Eğer j>n ise git adım ___
Adım 9:Eğer n&j=0 ise T2=T2+j
Adım 10:j=j+1
Adım 11:Eğer T1=n veya T2=m ise yaz " m ve n dost sayılardır."
Adım 12:Aksi taktirde yaz "m ve n dost sayılar değildir."
Adım 13:Bitir
 */
package homeworks;
import java.util.Scanner;
public class friend_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        int m;
        int T1=0;
        int T2=0;
        do {
            System.out.println("Lütfen 1. pozitif tamsayıyı giriniz");
            m=input.nextInt();
        } while (m<=0);
        do {
            System.out.println("Lütfen 2. pozitif tamsayıyı giriniz");
            n=input.nextInt();
        } while (n<=0);
        for (int i = 1; i < m; i++) {
            if (m%i==0) {
                T1=T1+i;
            }
        }
        for (int j = 1; j < n; j++) {
            if (n%j==0) {
                T2=T2+j;
            }
        }
        if (T1==n || T2==m) {
            System.out.println(+m+" ve "+n+" dost sayılardır");
        }
        else{
            System.out.println(+m+" ve "+n+" dost sayılar değildir");
        }
        
    }
    
}
