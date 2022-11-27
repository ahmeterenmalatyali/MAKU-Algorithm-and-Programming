/*
Adım 1:Başlat
Adım 2:Kullanıcı cismin kütlesini yazar
Adım 3:Kullanıcı cismin hızını yazar
Adım 4:Kullanıcı cismin yerden yüksekliğini yazar
Adım 5:Potansiyel enerji=m.g.h ile bulunur(g=10)
Adım 6:Kinetik enerji=m.v² ile bulunur
Adım 7:Bitir
(m=kütle)
(g=yerçekimi ivmesi)
(h=cismin yerden yüksekliği)
(v=cismin hızı)
*/
package homeworks;
import java.util.Scanner;
public class pot_kin_enerji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen cismin kütlesini yazınız:");
        int m = input.nextInt();
        System.out.println("Lütfen cismin hızını yazınız:");
        int v = input.nextInt();
        System.out.println("Lütfen cismin yerden yüksekliğini yazınız:");
        int h = input.nextInt();
        double pot = m*10*h ;
        double kin = (m*v*v)/2 ;
        System.out.println("Potansiyel enerji:"+pot);
        System.out.println("Kinetik enerji:"+kin);
        
    }
    
}
