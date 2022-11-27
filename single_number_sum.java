/*
1'den n e kadar olan tek sayıların toplamı
Adım 1:Başlat
Adım 2:Kullanıcıdan n sayısı alınır
Adım 3:S=1
Adım 4:T=0
Adım 5:Eğer S>n ise git adım 9
Adım 6:T=T+S
Adım 7:S=S+2
Adım 8:Git adım 5
Adım 9:Yaz T
Adım 10:Bitir
*/
package homeworks;
import java.util.Scanner;
public class single_number_sum {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Lütfen bir sayı giriniz");
int n = input.nextInt();
int T=0;
int S=1;
while(S<=n){
    T = T + S ;
    S = S +2 ;
}
System.out.println("1'den n'e kadar olan sayıların toplamı: "+T);
        

    }
    
}
