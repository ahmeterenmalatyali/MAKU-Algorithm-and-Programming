/*
->Klavyeden girilen terim sayısına(n) göre üçgensel sayıları yazan program
Üçgensel sayı:n*(n+1)/2
Adım 1:Başlat
Adım 2:Klavyeden terim sayınsı(n) al
Adım 3:i=1
Adım 4:Eğer i>n ise git adım ___
Adım 5:S=(i*(i+1))/2
Adım 6:Yaz S
Adım 7:i=i+1
Adım 8:Git adım 4
Adım 9:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework41 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen terim sayısı giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        for (int i = 1; i <= n; i++) {
            int S=(i*(i+1))/2;
            System.out.print(S+" , ");
        }
    }
    
}
