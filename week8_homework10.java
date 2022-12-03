/*
->π/2=2²/(2²-1)*4²/(4²-1)*6²/(6²-1)*...*(2k)²/((2k)²-1)
Adım 1:Başlat
Adım 2:Klavyeden terim sayısı(n) al
Adım 3:k=1,T=1
Adım 4:Eğer k>n ise git adım 9
Adım 5:s=2*k
Adım 6:T=T*(s*s)/((s*s)-1)
Adım 7:k=k+1
Adım 8:Git adım 4
Adım 9:Yaz T*2
Adım 10:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen terim sayısını giriniz: ");
            n=input.nextInt();
        } while (n<=0 || n%1!=0);
        double T=1;
        for (int k = 1; k <= n; k++) {
            int s=2*k;
            T=T*(s*s)/((s*s)-1);
        }
        System.out.println("π="+T*2);
    }
    
}
