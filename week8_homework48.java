/*
->Kullanıcıdan alınan fibonacci teriminden önceki ve sonraki terimi bulma
Adım 1:Başlat
Adım 2:Klavyeden fibonacci dizisi terimi(f2) al
Adım 3:ao=(1+√5)/2
Adım 4:f1=f2/ao
Adım 5:f3=f2*ao
Adım 6:Yaz f1 , f3
Adım 7:Bitir
 */
package homeworks;
import java.util.Scanner;
import java.lang.Math;
public class week8_homework48 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int f2;
        do {
            System.out.print("Lütfen fibonacci dizisinin büyük bir terimini giriniz: ");
            f2=input.nextInt();
        } while (f2<=1);
        double x=Math.sqrt(5);
        double ao=(1+x)/2;
        double f1=f2/ao;
        double f3=f2*ao;
        System.out.println("Önceki sayı: "+(int)f1);
        System.out.println("Sonraki sayı: "+(int)f3);
    }
    
}
