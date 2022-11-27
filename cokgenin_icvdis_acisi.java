/*
Adım 1:Başlat
Adım 2:Kullanıcı çokgenin kenar sayısını girer
Adım 3:Çokgenin bir iç açısı=((n-2).180)/n ile bulunur
Adım 4:Çokgenin bir dış açısı=360/n
Adım 5:Bitir
*/
package homeworks;
import java.util.Scanner;
public class cokgenin_icvdis_acisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen düzgün çokgenin kenar sayısını giriniz:");
        int n = input.nextInt();
        int ic = ((n-2)*180)/n;
        int dis = 360/n;
        System.out.println("Çokgenin bir iç açısı:"+ic);
        System.out.println("Çokgenin bir dış açısı:"+dis);
    }
    
}
