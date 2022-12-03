/*
->ln(2)=1/(1*2)+1/(3*4)+1/(5*6)+1/(7*8)+...+1/((2*n)*(2*n-1))
Adım 1:Başlat
Adım 2:Klavyeden terim sayısı(n) al
Adım 3:i=1,T=0;k=1
Adım 4:Eğer k>n ise git adım ___
Adım 5:T=T+1/(i*(i+1)
Adım 6:i=i+2
Adım 7:k=k+1
Adım 8:Git adım 4
Adım 9:Yaz T
Adım 10:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen terim sayısını giriniz: ");
            n=input.nextInt();
        } while (n<=0 || n%1!=0);
        double T=0;
        int i=1;
        for (int k = 1; k <= n; k++) {
            int j=i+1;
            T+=(double)1/(i*j);
            i=i+2;
        }
        System.out.println("ln(2)="+T);
    }
    
}
