/*
1²+2²+3²+...+n²=? 
Adım 1:Başlat
Adım 2:Klavyeden n sayısı gir
Adım 3:T=0
Adım 4:k=1
Adım 5:Eğer k>n git adım 9
Adım 6:T=T+(k.k)
Adım 7:k=k+1
Adım 8:Git adım 5
Adım 9:Yazdır T
Adım 10:Bitir
 */
package homeworks;
import java.util.Scanner;
public class n_square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz");
        int n = input.nextInt();
        int T = 0;
        int k = 1;
        while (k<=n) {
            T=T+(k*k);
            k=k+1;
           
            
        }
        System.out.println(+T);
        
        
    }
    
}
