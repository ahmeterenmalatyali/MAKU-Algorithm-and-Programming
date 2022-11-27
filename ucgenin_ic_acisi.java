/*
Adım 1:Başlat
Adım 2:Kullanıcı birinci açıyı yazar
Adım 3:Kullanıcı ikinci açıyı yazar
Adım 4:Üçüncü açı= 180-1.açı-2.açı
Adım 5:Bitir
*/
package homeworks;
import java.util.Scanner;
public class ucgenin_ic_acisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci açıyı yazınız:");
        int a = input.nextInt();
        System.out.println("İkinci açıyı yazınız:");
        int b = input.nextInt();
        int c = 180-a-b ;
        System.out.println("Üçüncü açı:"+c);
    }
    
}
