/*
->Klavyeden girilen basamak sayısına göre palindrom sayıların toplamını yazan program
Adım 1:Başlat 
Adım 2:Klavyeden basamak sayısını(n) al
Adım 3:Eğer n=1 ise yaz 45
Adım 4:Eğer n=2 ise yan 495
Adım 5:Aksi taktirde Yan 495*10^(n-2)
Adım 6:Bitir
 */
package homeworks;
import java.util.Scanner;
import java.lang.Math;
public class week8_homework39 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen basamak sayısı giriniz: ");
            n=input.nextInt();
        } while (n<1);
        double x=Math.pow(10, n-2);
        if (n==1) {
            System.out.println(+n+" basamaklı palindrom sayıların toplamı: "+45);
        }
        else if (n==2) {
            System.out.println(+n+" basamaklı palindrom sayıların toplamı: "+495);
        }
        else{
            System.out.println(+n+" basamaklı palindrom sayıların toplamı: "+495*x);
        }
        
    }
    
}
