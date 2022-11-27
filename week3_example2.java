/*
3 sayı arasından en büyüğü bulma
Adım 1:Başlat
Adım 2:a,b,c sayıları al
Adım 3:Eğer a>b ve a>c ise yaz a en büyük sayıdır
Adım 4:Eğer b>a ve b>c ise yaz b en büyük sayıdır
Adım 5:Eğer c>a ve c>b ise yaz c en büyük sayıdır
Adım 6:Aksi taktirde yaz sayıların birbirlerine karşı üstünlüğü yoktur.
Adım 7:Bitir
*/
import java.util.Scanner;
public class week3_example2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz");
        int a = input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz");
        int b = input.nextInt();
        System.out.println("Lütfen üçüncü sayıyı giriniz");
        int c = input.nextInt();
        if (a>b && a>c) {
            System.out.println(a+" en büyük sayıdır");
        }
        else if (b>a && b>c) {
            System.out.println(b+" en büyük sayıdır");
        } 
        else if (c>a && c>b) {
            System.out.println(c+" en büyük sayıdır");
        }
        else {
            System.out.println("Sayıların birbirlerine karşı üstünlüğü yoktur.");
        }
 }
}
        
    
    

