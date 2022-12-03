/*
->Klavyeden girilen terim sayısı kadar negafibonacci sayılarını yazan program
NegaFibonacci sayıları:bir artılı bir eksili giden fibonacci dizisi
Adım 1:Başlat 
Adım 2:Kullanıcıdan terim sayısı(n) al
Adım 3:a=1,b=1,i=1
Adım 4:Eğer i>n ise git adım 10
Adım 5:c=a+b
Adım 6:a=b,b=c
Adım 7:Yaz a*(-1)^(i+1))
Adım 8:i=i+1
Adım 9:Git adım 4
Adım 10:Bitir
 */
package homeworks;
import java.util.Scanner;
import java.lang.Math;
public class week8_homework46 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen terim sayısı giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        System.out.println();
        int a=1;
        int b=1;
        for (int i = 1; i <= n; i++) {
            int c=a+b;
            double x=Math.pow(-1,i+1);
            System.out.print(a*(int)x+" , ");
            a=b;
            b=c;
        }
    }
    
}
