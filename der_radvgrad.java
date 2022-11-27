/*
Adım 1:Başlat 
Adım 2:Kullanıcı dereceyi girer
Adım 3:Radyan derece/180 ile bulunur
Adım 4:Gradyan (derece.10)/9 ile bulunur
Adım 5:Bitir
*/
package homeworks;
import java.util.Scanner;
public class der_radvgrad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     System.out.println("lütfen dereceyi giriniz:");
     double der = input.nextInt();
     double rad = (der)/(180) ;
     double grad = (der*10)/9;
     System.out.println("Hesaplanan Radyan:"+rad +" π");
     System.out.println("Hesaplanan Gradyan:"+grad);
    }
   
}
