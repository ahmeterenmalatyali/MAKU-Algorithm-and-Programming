/*
kenar uzunlukları verilen üçgenin ikizkenar , eşkenar veya çeşitkenar olduğunu göster
Adım 1:Başlat
Adım 2:Kullanıcıdan üçgenin kenar uzunlukları alınır
Adım 3:Eğer 3 kenarda eşit ise "eşkenar üçgen" yazılır
Adım 4:Eğer yazlnız 2 kenarı eşit ise "ikizkenar üçgen" yazılır
Adım 5:Aksi taktirde "çeşitkenar üçgen" yazılır
Adım 6:Bitir
 */
package homeworks;
import java.util.Scanner;
public class which_triangle {

    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz");
  int a = input.nextInt();
  int b = input.nextInt();
  int c = input.nextInt();
        if (a==0 || b==0 || c==0) {
            System.out.println("Lütfen 0 dan farkli bir değer girerek tekrar deneyiniz");   
        }
        else if (a<0 || b<0 || c<0) {
            System.out.println("Lütfen pozitif bir değer girerek tekrar deneyiniz");
        }
            else if (a==b && a==c) {
            System.out.println(+a +" "+b +" "+c +" üçgeni eşkenar üçgendir");
        }
            else if (a==b || a==c || c==b) {
            System.out.println(+a +" "+b +" "+c +" üçgeni ikizkenar üçgendir");
        }
            else {
            System.out.println(+a +" "+b +" "+c +" üçgeni çeşitkenar üçgendir");
                
            }
            
        }
    }
    

