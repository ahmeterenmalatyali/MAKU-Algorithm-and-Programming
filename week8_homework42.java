/*
->Klavyeden girilen terim sayısı için kare üçgensel sayıları veren program
Kare üçgensel sayıları:hem üçgensel hem tam kare sayılar
Adım 1:Başlat 
Adım 2:Klavyeden terim sayısı(n) al
Adım 3:i=1,s=1
Adım 4:Eğer i>n ise git adım 9
Adım 5:S=(s*(s+1))/2
Adım 6:Eğer S^(1/2)%1=0 ise Yaz S ve i=i+1
Adım 7:s=s+1
Adım 8:Git adım 4
Adım 9:Bitir
 */
package homeworks;
import java.util.Scanner;
import java.lang.Math;
public class week8_homework42 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen terim sayısı giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        int i=1;
        int s=1;
        while(i<=n){
            int S=(s*(s+1))/2;
            double x=Math.sqrt(S);
            if (x%1==0) {
                System.out.print(S+" , ");
                i=i+1;
            }
            s=s+1;
        }
    }
    
}
