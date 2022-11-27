/*
->Klavyrden girilen pozitif tamsayının aritmetik sayı olup olmadığını bulan program
Aritmetik Sayı:Herhangi bir pozitif tamsayının tam bölenlerinin ortalaması gene tam sayı ise bu sayı aritmetiktir.
Adım 1:Başlat
Adım 2:Klavyeden N pozitif tamsayısı al
Adım 3:k=1,T=0
Adım 4:Eğer k>N ise git adım 8
Adım 5:Eğer N%k=0 ise T=T+k
Adım 6:k=k+1
Adım 7:Git adım 4
Adım 8:Eğer T/2=N ise yaz "Aritmetik Sayıdır."
Adım 9:Aksi taktirde yaz "Aritmetik Sayı Değildir."
Adım 10:Bitir
 */
package homeworks;
import java.util.Scanner;
public class arithmetic_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N;
        do {
            System.out.print("Lütfen pozitif bir tamsayı giriniz: ");
            N=input.nextInt();
        } while (N<=0);
        int T=0;
        for (int k = 1; k <= N; k++) {
            if (N%k==0) {
                T=T+k;
            }            
        }
        if (T/2==N) {
            System.out.println(+N+" aritmetik sayıdır ");
        }
        else{
            System.out.println(+N+" aritmetik sayı değildir");
        }
    }
    
}
