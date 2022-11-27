/*
İstenilen değerden farklı girilen sayının kullanıcıdan değiştirilmesini isteme
*/
import java.util.Scanner;
public class week5_example1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;
        do {
            System.out.print("Lütfen pozitif bir tam sayı giriniz:");
            sayi = input.nextInt();
        } while (sayi<=0);
        System.out.println("Gİrilen sayı: "+sayi);
        
        /*
        System.out.print("Lütfen pozitif bir tam sayı giriniz:");
           int sayi = input.nextInt();
        while (sayi<=0){
        System.out.print("Lütfen pozitif bir tam sayı giriniz:");
            sayi = input.nextInt();
        }
        */
    }
    
}
