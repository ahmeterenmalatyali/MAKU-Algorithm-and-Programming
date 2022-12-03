/*
->Klavyeden girilen sayının mükemmel sayı olup olmadığını bulan program
Mükemmel Sayı:Pozitif bir tamsayının tam bölenlerinin toplamı bu sayının 2 katına eşitse bu sayoya mükemmel sayı denir.
Adım 1:Başlat
Adım 2:Klavyeden pozitif N tam sayısı al
Adım 3:k=1,T=0
Adım 4:Eğer k>N ise git adım 8
Adım 5:Eğer N%k=0 ise T=T+k
Adım 6:k=k+1
Adım 7:Git adım 4
Adım 8:Eğer T=N*2 ise yaz "Mükemmel sayıdır"
Adım 9:Aksi taktirde yaz "Mükemmel sayı değildir"
Adım 10:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N;
        do {
            System.out.println("Lütfen pozitif bir tamsayı giriniz: ");
            N=input.nextInt();
        } while (N<=0);
        int T=0;
        for (int k = 1; k <= N; k++) {
            if (N%k==0) {
                T=T+k;
            }            
        }
        if (T==N*2) {
            System.out.println(+N +" Mükemmel Sayıdır.");
        }
        else{
            System.out.println(+N+" Mükemmel Sayı Değildir.");
        }
    }
    
}
