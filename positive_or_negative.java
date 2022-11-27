/*
Sayının pozitif , negatif veya sıfır olduğunu göster
Adım 1:Başlat
Adım 2:Kullanıcıdan bir tam sayı al
Adım 3:Eğer verilan sayı sıfırdan büyükse "pozitiftir" yazdır
Adım 4:Eğer verilen sayı sıfırdan küçükse "negatiftir" yazdır
Adım 5:Aksi taktirde "sıfırdır" yazdır
Adım 6:Bitir
*/
package homeworks;
import java.util.Scanner;
public class positive_or_negative {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen bir tamsayı giriniz");
    int Z = input.nextInt();
        if (Z>0) {
            System.out.println(+Z +" pozitiftir");            
        }
        if (Z==0) {
            System.out.println("sıfırdır");
        }
        if (Z<0) {
            System.out.println(+Z +" negatiftir");
            
        }
    
        
    }
    
}
