/*
Adım 1:Başlat
Adım 2:Kullanıcıdan zaman alınır
Adım 3:S=1
Adım 4:T=0
Adım 5:Eğer S>t ise git adım 9
Adım 6:T=T+S
Adım 7:S=S+2
Adım 8:Git adım 5
Adım 9:Yaz T.5
Adım 10:Bitir
*/
package homeworks;
import java.util.Scanner;
public class h_3h_5h_rule {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Lütfen zamanı girin");
int t = input.nextInt();
int T=0;
int S=1;
while(S<=t){
    T = T + S ;
    S = S +2 ;
}
System.out.println(+t +". saniyede cismin yerden yüksekliği: "+T*5);

    }
    
}
