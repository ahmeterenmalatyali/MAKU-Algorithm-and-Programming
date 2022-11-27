/*
Adım 1:Başlat
Adım 2:Kullanıcı alınan yolu girer
Adım 3:kullanıcı geçen zamanı girer
Adım 4:Ortalama hız=alınan yol.geçen zaman ile hesaplanır
Adım 5:Bitir
 */
package homeworks;
import java.util.Scanner;
public class Ort_hiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen alınan yolu(m) giriniz:");
        int X = input.nextInt();
        System.out.println("Lütfen geçen zamanı(sn) giriniz:");
        int t = input.nextInt();
        int Vort = X*t ;
        System.out.println("Ortalama hız(m/s):"+Vort);
    }
    
}
