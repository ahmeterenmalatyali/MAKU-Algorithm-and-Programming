/*
->eˣ= Lim,n→∞(1+(x/n)^n) için eˣ değerini bul
Adım 1:Başlat
Adım 2:Klavyeden x ve n'i al
Adım 3:sonuc=1+(x/n)^n
Adım 4:Yaz sonuc
Adım 5:Bitir
 */
package homeworks;
import java.util.Scanner;
import java.lang.Math;
public class week8_homework01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen x değerini giriniz: ");
        int x=input.nextInt();
        System.out.print("Lütfen n değerini giriniz: ");
        int n=input.nextInt();
        double sonuc=(double)Math.pow(1+(x/n), n);
        if (n==0) {
            System.out.println("e üssü "+x+"=1");                        
        }
        else{
            System.out.println("e üssü "+x+"="+sonuc);
        }        
    }
    
}
