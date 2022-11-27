/*
7'den büyük ve 3a + 3b şeklinde yazılan N sayısı için a ve b yi bulan program
Adım 1:Başlat
Adım 2:7 den büyük N saysısı al
Adım 3:a=0
Adım 4:Eğer a>N/3 ise git adım 
Adım 5:Eğer b>N/5 ise git adım 10
Adım 6:b=0
Adım 7:Eğer 3*a+5*b=N ise yaz (3xa)+(5xb)=N
Adım 8:b=b+1
Adım 9:Git adım 5
Adım 10:a=a+1
Adım 11:Git adım 4
Adım 12:Bitir
 */
package homeworks;
import java.util.Scanner;
public class multiples_of_threenfive {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int N;
        do {
           System.out.print("Lütfen 7 den büyük bir tamsayı giriniz: ");
           N=input.nextInt();
        } while (N<=7);
        for (int a = 0; a < N; a++) {
            for (int b = 0; b < N; b++) {
                if ((3*a)+(5*b)==N) {
                    System.out.println("3x"+a+"+5x"+b+"="+N);
                    System.out.println ("a="+a);
                    System.out.println ("b="+b);
                }
            }
        }
    }
    
}
