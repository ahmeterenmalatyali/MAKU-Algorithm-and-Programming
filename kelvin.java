/*
Adım 1:başlat
Adım 2:Kullanıcı kelvine dönüştüreceği dereceyi girer
Adım 3:Kelvin=Derece+273,15 ile bulunur
Adım 4:Bitir
*/
package homeworks;
import java.util.Scanner;
public class kelvin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Lütfen dereceti yazınız:");
    double C = input.nextDouble();
    double K = C+273.15 ;
    System.out.println("Derecenin kelvin cinsinden değeri:"+K);
    }
    
}
