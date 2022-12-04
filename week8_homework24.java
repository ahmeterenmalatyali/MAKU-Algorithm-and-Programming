/*
->n=(2^i)*(2^(i+1)-1) için 2^(i+1)-1 asal ise sayı mükemmel sayıdır.

Adım 1:Başlat 
Adım 2:Klavyeden üst sınır(n) al
Adım 3:i=1
Adım 4:Eğer i>n ise git adım 15
Adım 5:a=2^i,b=2^(i+1)-1
Adım 6:asalmi=true,j=2
Adım 7:Eğer j>=b ise git adım 11
Adım 8:Eğer b%j=0 asalmi=false
Adım 9:j=j+1
Adım 10:Git adım 7
Adım 11:Eğer a*b>n ise Git adım 15
Adım 12:Eğer asalmi=true Yaz a*b
Adım 13:i=i+1
Adım 14:Git adım 4
Adım 15:Bitir
 */
package homeworks;
import java.util.Scanner;
import java.lang.Math;
public class week8_homework24 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen pozitif bir tamsayı giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        for (int i = 1; i <= n; i++) {
            double a=(int)Math.pow(2, i);
            double b=(int)Math.pow(2,i+1)-1;
            boolean asalmi=true;
            for (int j = 2; j < b; j++) {
                if (b%j==0) {
                    asalmi=false;
                }    
            }
            if (a*b>n) {
                break;
            }
            if (asalmi==true) {
                System.out.print((int)a*(int)b+" , ");
            }           
        }
    }
    
}
