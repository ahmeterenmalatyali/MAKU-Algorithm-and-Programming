/*
->Klavyeden girilen üst sınıra kadar asal sayıları yazan program
Adım 1:Başlat
Adım 2:Klavyeden üst sınır(N) al
Adım 3:k=2,
Adım 4:Eğer k>N ise git adım 14
Adım 5:i=2
Adım 6:Eğer i=>k ise git adım 11
Adım 7:asalmı doğru kabul et
Adım 8:Eğer k%i=0 ise asalmi yanlış
Adım 9:i=i+1
Adım 10:Git adım 6
Adım 11:Eğer asalmi doğru ise yaz k
Adım 12:k=k+1
Adım 13:Git adım 4
Adım 14:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N;
        do {
            System.out.print("Lütfen 1 den büyük bir sınır giriniz: ");
            N=input.nextInt();
        } while (N<2);
        for (int k = 2; k <= N; k++) {
            boolean asalmi=true;
            for (int i = 2; i < k; i++) {
                if (k%i==0) {
                    asalmi=false;
                }
            }
            if (asalmi==true) {
                System.out.print(+k+" , ");
            }
        }
    }
    
}
