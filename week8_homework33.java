/*
->Klavyeden girilen pozitif tamsayının tau sayısı olup olmadığını bulan program
Tau sayısı:tam bölenleri sayısına tam bölünen sayılar
Adım 1:Başlat 
Adım 2:Klavyeden pozitif tamsayı(n) al
Adım 3:i=1,s=0
Adım 4:Eğer i>n ise git adım 8
Adım 5:Eğer n%i=0 ise s=s+1
Adım 6:i=i+1
Adım 7:Git adım 4
Adım 8:Eğer n%s=0 ise yaz tau sayısıdır
Adım 9:Aksi taktirde yaz tau sayısı değildir
Adım 10:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework33 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen pozitif bir tamsayı giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        int s=0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                s=s+1;
            }
        }
        if (n%s==0) {
            System.out.println(+n+" tau sayısıdır.");
        }
        else{
            System.out.println(+n+" tau sayısı değildir.");
        }
    }
    
}
