/*
Adım 1:Başlat
Adım 2:Kullanıcı 1.açıyı yazar
Adım 3:Kullanıcı 2.açıyı yazar
Adım 4:Kullanıcı 3.açıyı yazar
Adım 5:Kullanıcı 4. açıyı yazar
Adım 6:5.açı=540-1.açı-2.açı-3.açı-4.açı ile bulunur
Adım 7:Bitir
*/
package homeworks;
import java.util.Scanner;
public class besgenin_ic_acisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci açıyı yazınız");
        int a = input.nextInt();
         System.out.println("İkinci açıyı yazınız");
        int b = input.nextInt();
         System.out.println("Üçüncü açıyı yazınız");
        int c = input.nextInt();
         System.out.println("Dördüncü açıyı yazınız");
        int d = input.nextInt();
        int e = 540-a-b-c-d;
         System.out.println("Beşinci açı:"+e);
    }
    
}
