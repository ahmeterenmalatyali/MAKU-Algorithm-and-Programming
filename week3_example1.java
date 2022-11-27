/*
sayının tek veya çift olduğunu bulma
Adım 1:Başlat
Adım 2:Kullanıcıdan sayi al
Adım 3:Eğer sayi%2==0 ise yaz çift sayıdır
Adım 4:Aksi taktirde yaz tek sayıdır
Adım 5:Bitir
*/
import java.util.Scanner;
public class week3_example1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = input.nextInt();
        if (sayi%2 == 0) {
            System.out.println(sayi+" çift sayıdır");            
        }
        else {
            System.out.println(sayi+" tek sayıdır");
        }   
    }
    
    }
