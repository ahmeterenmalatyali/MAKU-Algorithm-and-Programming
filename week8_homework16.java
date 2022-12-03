/*
->Üçgenin kenarları = a , a , a*(1+5^(1/2))/2
Adım 1:Başlat
Adım 2:Klavyeden ikizkenar üçgenin 3 kenarını al (a , b , c)
Adım 3:Eğer a=b ise c=a*(1+5^(1/2))/2
Adım 4:Eğer a=c ise b=a*(1+5^(1/2))/2
Adım 5:Eğer b=c ise a=b*(1+5^(1/2))/2
Adım 6:Yaz a , b , c
Adım 7:Bitir
 */
package homeworks;
import java.lang.Math;
import java.util.Scanner;
public class week8_homework16 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a;
        do {
            System.out.print("Lütfen ikizkenar üçgenin kısa kenarını giriniz: ");
            a=input.nextDouble();
        } while (a<=0);
        double x=Math.sqrt(5);
        double b= a*(1+x)/2;
        System.out.print("Kısa kenarını girdiğiniz altın üçgen:"+a+" , "+b+" , "+b+" üçgenidir");
    }
    
}
