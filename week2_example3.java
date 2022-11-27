/*
3 sayının toplamı , çarpımı ve ortalaması
*/
import java.util.Scanner;
public class week2_example3 {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz:");
        int a = input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz:");
        int b = input.nextInt();
        System.out.println("Lütfen üçüncü sayıyı giriniz:");
        int c = input.nextInt();
        double toplama = a+b+c;
        double carpim = a*b*c ;
        double ortalama = (double) toplama/3 ;
        System.out.println("Ortalama: "+ ortalama +" , Toplam  " + toplama +" , " +" ve Çarpım: "+ carpim);
    }
    
}
