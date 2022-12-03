/*
->Klavyeden girilen adet sayısınca heterometrik sayı yazan program
Heterometrik sayı:a*(a+1) şeklinde yazılabilen pozitif tam sayılar
Adım 1:Başlat 
Adım 2:Klavyeden terim sayısı(n) al
Adım 3:i=1
Adım 4:Eğer i>n ise git adım 9
Adım 5:u=i*(i+1)
Adım 6:Yaz u
Adım 7:i=i+1
Adım 8:Git adım 4 
Adım 9:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework34 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen terim sayısı giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        for (int i = 1; i <= n; i++) {
            int u=i*(i+1);
            System.out.print(+u+" , ");
        }
    }
    
}
