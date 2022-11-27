/*
Klavyeden girilen sayının asal sayı olup olmadığını bulan program
Adım 1:Başlat
Adım 2:Klavyeden n sayısı gir
Adım 3:k=2
Adım 4:Eğer k>=n ise git adım
Adım 5:Eğer n%k==0 ise yaz Asal değildir
Adım 6:k+=k
Adım 7:Git adım 4
Adım 8:Yaz asaldır
Adım 9:Bitir
 */
import java.util.Scanner;
public class week4_example5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı giriniz");
        int n = input.nextInt();
        boolean asalmi = true; //varsayım/asal olursa
        for (int i = 2; i < n; i++){
            if (n%i ==0) {
                asalmi=false;
                
            }
        }
        if (asalmi==true && n!=1) {
            System.out.println(+n+" asaldır");
        }
        else {
            System.out.println(+n+" asal değildir");
        }
            }
    
}
