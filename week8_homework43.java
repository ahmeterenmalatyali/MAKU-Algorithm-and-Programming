/*
->Klavyeden girilen terim sayısı kadar fibonacci dizisini yazan program
Adım 1:Başlat
Adım 2:Kullanıcıdan terim sayısı(n) al
Adım 3:i=2,yaz 1 , 1
Adım 4:a=1
Adım 5:b=1
Adım 6:Eğer i>n ise git adım 12
Adım 7:c=a+b
Adım 8:Yaz c
Adım 9:a=b,b=c
Adım 10:i=i+1
Adım 11:Git adım 4
Adım 12:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework43 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen 2 veya daha büyük bir terim sayısı giriniz: ");
            n=input.nextInt();
        } while (n<=1);
        System.out.print("1 , 1");
        int a=1;
        int b=1;
        for (int i = 2; i < n; i++) {            
            int c=a+b;
            System.out.print(" , "+c+" ");
            a=b;
            b=c;
        }
    }
    
}
