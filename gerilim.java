/*
Adım 1:Başlat
Adım 2:Kullanıcı iletkenin direncini girer
Adım 3:Kullanıcı iletkenin akımını girer
Adım 4:Gerilim direnç.akım ile bulunur
Adım 5:Bitir
*/
package homeworks ;
import java.util.Scanner;
public class gerilim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Lütfen iletkenin direncini giriniz:");
    int R = input.nextInt();
    System.out.println("Lütfen iletkenin akımını giriniz:");
    int I = input.nextInt();
    double gerilim = R*I ;
    System.out.println("İletkenin gerilimi:"+gerilim);
    }
    
}
