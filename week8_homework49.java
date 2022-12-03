/*
->Klavyeden girilen terim sayısı kadar pell sayısı giren program
Pell sayısı=P(k)=((1+√2)^k-(1-√2)^k)/(2*√2)
Adım 1:Başlat 
Adım 2:Klavyeden terim sayısı(n) al
Adım 3:i=0,a=0,b=1
Adım 4:Eğer i=>n ise git adım 9
Adım 5:c=a+2*b
Adım 6:Yaz a
Adım 7:a=b,b=c
Adım 8:Git adım 4
Adım 9:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework49 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen terim sayısı giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        int a=0;
        int b=1;
        int i=0;
        while (i<n){
            int c=a+2*b;
            System.out.print(+a+" , ");
            a=b;
            b=c;
            i=i+1;
        }
    }
    
}
