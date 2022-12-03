/*
->Klavyeden girilen terim sayısı kadar tribonacci sayılarını yazan program
Tribonacci sayıları:kendinden önceki 3 sayının toplamı olarak yazılan dizi
Adım 1:Başlat
Adım 2:Klavyeden terim sayısı(n) al
Adım 3:i=1,a=1,b=1,c=2
Adım 4:Eğer i>n ise git adım 10
Adım 5:d=a+b+c
Adım 6:a=b,b=c,c=d
Adım 7:Yaz a
Adım 8:i=i+1
Adım 9:Git adım 4
Adım 10:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework47 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen terim sayısını giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        int a=1;
        int b=1;
        int c=2;
        for (int i = 1; i <= n; i++) {
            int d=a+b+c;
            System.out.print(+a+" , ");
            a=b;
            b=c;
            c=d;            
        }
    }
    
}
