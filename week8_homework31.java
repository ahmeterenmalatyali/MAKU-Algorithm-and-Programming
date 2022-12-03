/*
->Klavyrden girilen 2 sayının bağdaşık sayılar olup olmadığını bulan program
Bağdaşık sayılar:2 basamaklı 2 doğal sayının birler basamağındaki sayıların toplamı 10 ve onlar basamağındaki rakamları aynı ise bu sayılar bağdaşık sayılardır
Adım 1:Başlat
Adım 2:Klavyeden 2 doğal sayı al (x ve y)
Adım 3:k1=x%10,k2=y%10
Adım 4:o1=x/10,o2=y/10
Adım 5:Eğer k1+k2=10 ve o1=o2 ise yaz bağdaşık sayılardır
Adım 6:Aksi taktirde yaz bağdaşık sayı değillerdir
Adım 7:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework31 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x;
        do {
            System.out.print("Lütfen 2 basamaklı birinci doğal sayıyı giriniz: ");
            x=input.nextInt();
        } while (x<=9 || x>99);
        int y;
        do {
            System.out.print("Lütfen 2 basamaklı ikinci doğal sayıyı giriniz: ");
            y=input.nextInt();
        } while ( y<=9 || y>99);
        int k1=x%10;
        int k2=y%10;
        int o1=x/10;
        int o2=y/10;
        if (k1+k2==10 && o1==o2) {
            System.out.println(+x+" ve "+y+" bağdaşık sayılardır.");
        }
        else{
            System.out.println(+x+" ve "+y+" bağdaşık sayılar değildir.");
        }
    }
    
}
