/*
Adım 1:Başlat
Adım 2:Kullanıcı kürenin yarıçapını girer
Adım 3:Kürenin alanı=4πr² ile bulunur
Adım 4:Kürenin hacmi=(4πr³)/3 ile bulunur
Adım 5:Hacim ve alan ekrana yazılır
Adım 6:Bitir
(r=yarıçap)
*/
package homeworks;
import java.util.Scanner;
public class kürenin_alanvhacmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("lütfen kürenin yarıçapını yazınız");
       int r = input.nextInt();
       double alan = 4*r*r;
       double hacim = (4*r*r*r)/3;       
       System.out.println("kürenin alanı:"+alan +" π");
       System.out.println("kürenin hacmi"+hacim +" π") ;
    }
    
}
