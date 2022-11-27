/*
Girilen x sayısına göre y=x²-5x+3 değerinin pozitif , negatif veya sıfır olduğunu bulma
Adım 1:Başlat
Adım 2:fonksiyon tanımlanır ve x değeri istenir
Adım 3:x fonksiyonda yazılır
Adım 4:Eğer y<0 ise "Sonuç negatiftir" yazılır
Adım 5:Eğer y=0 ise "Sonuç sıfırdır" yazılır
Adım 6:Eğer y>0 ise "Sonuç pozitiftir" yazılır
Adım 7:Bitir
 */
package homeworks;
import java.util.Scanner;
public class f_fonks {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("fonksiyon :f(x)=y=x²-5x+3");
      System.out.println("Lütfen x değerini giriniz");
      double x=input.nextDouble();
      double y=(x*x)-(5*x)+3;
        if (y<0) {
            System.out.println("Sonuç= "+y+" negatiftir");
        }
        if (y==0) {
            System.out.println("Sonuç sıfırdır");
        }
        if (y>0) {
            System.out.println("Sonuç= "+y+" pozitiftir");
        }
    }
    
}
