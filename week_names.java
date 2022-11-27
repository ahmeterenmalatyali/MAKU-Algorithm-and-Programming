/*
1-7 arası girilen sayıya göre hafta adı söyle
Adım 1:Başlat
Adım 2:Kullanıcıdan 1 ile 7 arası sayı al
Adım 3:Eğer kullanıcı 1 girerse "Pazartesi" yaz
Adım 4:Eğer kullanıcı 2 girerse "Salı" yaz
Adım 5:Eğer kullanıcı 3 girerse "Carşamba" yaz
Adım 6:Eğer kullanıcı 4 girerse "Perşembe" yaz
Adım 7:Eğer kullanıcı 5 girerse "Cuma" yaz
Adım 8:Eğer kullanıcı 6 girerse "Cumartesi" yaz
Adım 9:Eğer kullanıcı 7 girerse "Pazar" yaz
Adım 10:Aksi taktirde "Lütfen 1 ile 7 arasında bir sayı giriniz!!" yaz
Adım 11:Bitir
*/
package homeworks;
import java.util.Scanner;
public class week_names {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      System.out.println("Lütfen 1 ile 7 arasında bir rakam girin");
      int Day = input.nextInt();  
        switch (Day) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Sayı 1 ile 7 arasında değil lütfen tekrar deneyiniz");
                break;
        }
    }
    
}
