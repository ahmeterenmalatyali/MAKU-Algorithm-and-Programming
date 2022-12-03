/*
->π=1-1/(3*3)+1/(5*3^2)-1/(7*3^3)+...+((-1)^(k-1))/(2*k-1)*3^(k-1))
Adım 1:Başlat
Adım 2:Klavyeden terim sayısı(n) al
Adım 3:T=1,k=1
Adım 4:Eğer k>=n git adım 8
Adım 5:T=T+((-1)^(k-1))/(2*k-1)*3^(k-1))
Adım 6:k=k+1
Adım 7:Git adım 4
Adım 8:Yaz T
Adım 9:Bitir
 */
package homeworks;
import java.util.Scanner;
import java.lang.Math;
public class week8_homework09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen terim sayısını giriniz: ");
            n=input.nextInt();
        } while (n<=0 || n%1!=0);
        double T=1;
        for (int k = 1; k < n; k++) {
            double a=Math.pow(-1,k-1);
            double b=Math.pow(3,k-1);
            T=T+a/((2*k-1)*b);
        }
        System.out.println("π="+T);
    }
    
}
