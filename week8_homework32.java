/*
->Klavyeden girilen pozitif bir tamsayının eksik sayı olup olmadığını bulan program
Eksik sayı:tam bölenlerinin toplamı sayının 2 katından eksik ise bu sayı eksik sayıdır
Adım 1:Başlat
Adım 2:Klavyeden pozitif tamsayı(n) al
Adım 3:i=1,T=0
Adım 4:Eğer i>n ise git adım 8 
Adım 5:Eğer n%i=0 ise T=T+i
Adım 6:i=i+1
Adım 7:Git adım 4
Adım 8:Eğer 2*T<n ise Yaz Eksik sayıdır
Adım 9:Aksi taktirde yaz Eksik sayı değildir
Adım 10:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework32 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen pozitif bir tamsayı giriniz: ");
            n=input.nextInt();
        } while (n<=0 && n%1!=0);
        int T=0;
        for (int i = 1; i <= n ; i++) {
            if (n%i==0) {
                T=T+i;
            }
        }
        if (2*T<n) {
            System.out.println(+n+" eksik sayıdır.");
        }
        else{
            System.out.println(+n+" eksik sayı değildir.");
        }
    }
    
}
