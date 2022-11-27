/*
Girilen sayının basamaklarındaki sayının toplamı
Adım 1:Başlat
Adım 2:Kullanıcıdan n sayısı al
Adım 3:T=0
Adım 4:Eğer N=0 ise git adım
Adım 5:K=N%10
Adım 6:T=T+K
Adım 7:N=N/10
Adım 8:Git adım 4
Adım 9:Yaz T
Adım 10:Bitir
 */
import java.util.Scanner;
public class week4_example4 {
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.println("Lütfen pozitif bir sayı giriniz");
    int N = input.nextInt();
    int T=0;
    while(N>0){
      int K=N%10;
        T=T+K;
        N=N/10;
    }
    System.out.println("Sonuç:"+T);
    }
    
}
