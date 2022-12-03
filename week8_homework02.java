/*
->eˣ=1+(x/1!)+(x^2/2!)+(x^3/3!)+...+(x^N/N!)   
Adım 1:Başlat
Adım 2:Klavyeden x ve N'i(negatif olmasın) al
Adım 3:T=1,k=1
Adım 4:Eğer k>N ise git adım 13
Adım 5:i=1,C=1
Adım 6:Eğer i>N ise git adım 10
Adım 7:C=C*i
Adım 8:i=i+1
Adım 9:Git adım 6
Adım 10:T=T+((x^k)/C)
Adım 11:k=k+1
Adım 12:Git adım 4
Adım 13:Yaz T
Adım 14:Bitir
 */
package homeworks;
import java.util.Scanner;
import java.lang.Math;
public class week8_homework02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen x değerini giriniz: ");
        int x=input.nextInt();
        int N;
        do {
            System.out.print("Lütfen terim sayısını giriniz: ");
            N=input.nextInt();
        } while (N<=0 || N%1!=0);         
        double T=1;
        for (int k = 1; k <= N; k++) {
            double C=1;
            for (int i = 1; i <= N; i++) {
                C=C*i;
            }
            double u=Math.pow(x,k);
            T=T+(u/C);        
        }
        System.out.println("e üssü "+x+"="+T);
    }  
}
