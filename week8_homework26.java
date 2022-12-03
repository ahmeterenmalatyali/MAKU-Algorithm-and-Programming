/*
->Klavyeden girilen terim sayısı kadar fermat sayısı yazan program
Fermat sayısı:2^(2^n)+1 şeklinde yazılan doğal sayılar
Adım 1:Başlat
Adım 2:Kullanıcıdan terim sayısı(n>0) al
Adım 3:Yaz 3
Adım 4:i=1
Adım 5:Eğer i>=n ise git adım 10
Adım 6:S=2^(2^n)+1
Adım 7:Yaz S
Adım 8:i=i+1
Adım 9:Git adım 5
Adım 10:Bitir
 */
package homeworks;
import java.util.Scanner;
import java.lang.Math;
public class week8_homework26 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen terim sayısını giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        System.out.print("3, ");
        for (int i = 1; i < n; i++) {
            double x=Math.pow(2,i);
            double y=Math.pow(2,x);
            double S=y+1;
            System.out.print(+S+", ");
        }
    }
    
}
