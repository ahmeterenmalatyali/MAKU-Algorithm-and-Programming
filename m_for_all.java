/*
Metreyi mm , cm , m veya km'ye dönüştürme
Adım 1:Başlat
Adım 2:Kullanıcı metre cinsinden uzunluk girer m
Adım 3:Kullanıcı uzunluk cinsini seçer 
1=mm
2=cm
3=dm
4=km
Adım 4:Eğer 1'i seçerse m*1000
Adım 5:Eğer 2'yi seçerse m*100
Adım 6:Eğer 3'ü seçerse m*10
Adım 7:Eğer 4'ü seçerse m/1000
Adım 8:Yazdır
Adım 9:Bitir
 */
package homeworks;
import java.util.Scanner;
public class m_for_all {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Lütfen uzunluğu metre cinsinden giriniz");
    int m = input.nextInt();
    System.out.println("Lütfen istediğiniz uzunluk birimini aşağıdaki sayılardan birini tuşlayarak giriniz");   
    System.out.println("1=mm");
    System.out.println("2=cm");
    System.out.println("3=dm");
    System.out.println("4=km");
    int k=input.nextInt();
        if (k==1) {
            int S=m*1000;
            System.out.println(+m +" m ="+S+" mm'dir.");
        }
        else if (k==2) {
            int S=m*100;
            System.out.println(+m+" m ="+S+" cm'dir.");            
        }
        else if (k==3) {
            int S=m*10;
            System.out.println(+m+" m ="+S+" dm'dir.");
        }
        else if (k==4) {
            int S=m/1000;
            System.out.println(+m+" m ="+S+" km'dir.");
        }
        else {
            System.out.println("Lütfen uzunluk cinsi için 1 ile 4 arasında bi sayı giriniz");
        }
    }
    
}
