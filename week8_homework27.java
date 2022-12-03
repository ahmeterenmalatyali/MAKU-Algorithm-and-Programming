/*
->Klavyeden girilen x ve y sayısına göre olabilecek tüm leyand sayılarını yazan program
Leyand sayısı:x^y+y^x şeklinde yazılabilen doğal sayılar
Adım 1:Başlat
Adım 2:Kullanıcıdan x(x>1) ve y (y>1) sayıları al
Adım 3:a=x^y , b= y^x
Adım 4:S=a+b
Adım 5:Yaz S
Adım 6:Bitir
 */
package homeworks;
import java.lang.Math;
import java.util.Scanner;
public class week8_homework27 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x;
        do {
            System.out.print("Lütfen x(x>1) değerini giriniz: ");
            x=input.nextInt();
        } while (x<=1);
        int y;
        do {
            System.out.print("Lütfen y(y>1) değerini giriniz: ");
            y=input.nextInt();
        } while (y<=1);
        double a=Math.pow(x,y);
        double b=Math.pow(y,x);
        double S=a+b;
        System.out.println(S);
    }
    
}
