/*
->Klavyeden giriler terim sayısınca fibonacci asal sayıları yazan program
Adım 1:Başlat
Adım 2:Klavyeden terim sayısı(n) al
Adım 3:i=1,a=1,b=1,c=0
Adım 4:Eğer i>n ise git adım 13
Adım 5:c=a+b
Adım 6:a=b,b=c,j=2
Adım 7:Eğer j>=c ise git adım 11
Adım 8:asamı=true
Adım 9:eğer c%j=0 ise asalmi=false
Adım 10:j=j+1
Adım 11:Git adım 6
Adım 12:Eğer asalmi=true ise yaz c ve i=i+1
Adım 13:Git adım 3
Adım 14:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework45 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen terim sayısı giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        int i=1;
        int a=1;
        int b=1;
        while(i<=n){
            int c=a+b;
            a=b;
            b=c;
            boolean asalmi=true;
            for (int j = 2; j < c; j++) {                
                if (c%j==0) {
                    asalmi=false;
                }
            }
            if (asalmi==true) {
                    System.out.print(+c+" , ");
                    i+=1;
                }
        }
    }
    
}
