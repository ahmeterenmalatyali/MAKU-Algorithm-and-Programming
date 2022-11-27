/*
Adım 1:Başlat
Adım 2:Kullanıcı çember diliminin yarıçapını girer
Adım 3:Kullanıcı çember diliminin açısını girer
Adım 4:Çember diliminin alanı=(πr²a)/360 ile bulunur
Adım 5:Bitir
(r=çember diliminin yarıçapı)
(a=çember diliminin açısı)
*/
package homeworks;
import java.util.Scanner;
public class cemberdiliminin_alani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Lütfen çember diliminin yarıçapını giriniz:");
    int r = input.nextInt();
    System.out.println("Çember diliminin açısını giriniz");
    int a = input.nextInt();
    double alan = (r*r*a)/360;
    System.out.println("Çember diliminin alanı:"+alan +" π");
    }
    
}
