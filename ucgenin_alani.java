/*
Adım 1:Başlat
Adım 2:Kullanıcı üçgenin kenar uzunluğunu girer
Adım 3:Kullanıcı verdiği kenara ait yüksekiği girer
Adım 4:Üçgenin alanı=(taban.yükseklik)/2 ile bulunur
Adım 5:Bitir
*/
package homeworks;
import java.util.Scanner;
public class ucgenin_alani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen üçgenin bir kenarının uzunluğunu giriniz:");
        int a = input.nextInt();
        System.out.println("Lütfen verilen kenara ait yüksekliği giriniz:");
        double b = input.nextInt();
        double alan = (a * b) / 2;
        System.out.println("Hesaplanan alan: "+alan);
        
    }
    
}
