/*
Girilen sayının tersten yazımı
Adım 1:Başlat
Adım 2:Kullanıcıdan bir N pozitif tam sayısı al
Adım 3:T=0
Adım 4:Eğer N=0 ise git adım 9
Adım 5:k=N%10
Adım 6:T=T*10+k
Adım 7:N=N/10
Adım 8:Git adım 4
Adım 9:Yazdır T
Adım 10:Bitir
 */
package homeworks;
import java.util.Scanner;
public class anti_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int N=input.nextInt();
        int T=0;
        if (N<0 || N==0) {
            System.out.println("Lütfen pozitif bir tamsayı girerek tekrar deneyiniz");
        }
        else{
            while(N>0){
                int k=N%10;
                T=T*10+k;
                N=N/10;
            }
            System.out.println("Girdiğiniz sayının tersi: "+T);
        }
    }
    
}
