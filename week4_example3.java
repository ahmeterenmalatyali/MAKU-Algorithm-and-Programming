/*
 klavyeden 2 sayı girilir iki sayı arasındaki 5 ile bölünebilenleri yazdır
Adım 1:Başlat
Adım 2:Klavyeden 2 sayı gir a ve b
Adım 3:S=a
Adım 4:Eğer S>b ise git Adım 8 
Adım 5:Eğer S%5==0 ise Yaz S
Adım 6:S=S+1
Adım 7:Git adım 4
Adım 8:Bİtir
 */
import java.util.Scanner;
public class week4_example3 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Lütfen a ile b sayısını giriniz");
System.out.print("a=");
int a = input.nextInt();
System.out.print("b=");
int b = input.nextInt();

        if (a==b) {
            System.out.println("Lütfen farklı 2 sayı giriniz");
        }
        if (a<b) {
            for(int S=a;S<=b;S++){
                if (S%5==0) {
                    System.out.println(+S);
                }
                } 
        }
                if (b<a) {
            for(int S=b;S<=a;S++){
                if (S%5==0) {
                    System.out.println(+S);
                }    
         }    
            
            }
    }
}  



