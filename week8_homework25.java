/*
->Klavyeden girilen terim sayısı kadar cullen sayısı giren program
Cullen sayısı:n*2^n+1 şeklinde yazılabilen doğal sayılar.
Adım 1:Başlat
Adım 2:Kullanıcıdan terim sayısı(n>0) al
Adım 3:Yaz 1
Adım 4:i=1
Adım 5:Eğer i>=n ise git adım 11
Adım 6:S=i*2î+1
Adım 8:Yaz S
Adım 9:i=i+1
Adım 10:Git adım 5
Adım 11:Bitir
 */
package homeworks;
import java.util.Scanner;
import java.lang.Math;
public class week8_homework25 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen terim sayısı giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        System.out.print("1 ,");
        for (int i = 1; i < n; i++) {
            double u=Math.pow(2,i);
            double S=i*u+1;
            System.out.print(+S+" ,");
        }
    }
    
}
