/*
->İki asal sayının farkı 2 ise bunlara ikiz asallar denir.Klavyeden girilen üst sınıra kadar ikiz asalları yazan program
Adım 1:Başlat
Adım 2:Kullanıcıdan üst sınırı(N) al (N>2)
Adım 3:k=2
Adım 4:Eğer k>N ise git adım 20
Adım 5:asalmi1=true kabul et
Adım 6:i=2
Adım 7:Eğer i>=k ise git adım 11
Adım 8:Eğer k%i=0 ise asalmi1=false
Adım 9:i=i+1 
Adım 10:Git adım 7
Adım 11:u=k+2
Adım 12:j=2 , asalmi2=true
Adım 13:Eğer j>=u ise git adım 17
Adım 14:Eğer u%j=0 ise asalmi2=false 
Adım 15:j=j+1
Adım 16:Git adım 13
Adım 17:Eğer asalmi2=true ve asalmi1=true ise Yaz k , u
Adım 18:k=k+1
Adım 19:Git adım 4
Adım 20:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N;
        do {
            System.out.print("Lütfen 2'den büyük bir alt sınır giriniz: ");
            N=input.nextInt();
        } while (N<=2);
        for (int k = 2; k <= N-2; k++) {
            boolean asalmi1=true;
            for (int i = 2; i < k; i++) {
                if (k%i==0) {
                    asalmi1=false;
                }
            }
            int u=k+2;
            boolean asalmi2=true;
            for (int j = 2; j < u; j++) {
                if (u%j==0) {
                    asalmi2=false;
                }
            }
            if (asalmi2==true && asalmi1==true) {
                System.out.print("("+k+","+u+") ");
            }
        }
    }
    
}
