/*
Kombinasyon
Adım 1:Başlat
Adım 2:kombinasyon için n ve r yi al
//n!
Adım 3:x=1
Adım 4:k=1
Adım 5:Eğer k>n git adım 9
Adım 6:x=x.k
Adım 7:x=x+1
Adım 8:Git adım 5
//r!
Adım 9:y=1
Adım 10:a=1
Adım 11:Eğer a>r git adım 15
Adım 12:y=y.a
Adım 13:a=a+1
Adım 14:Git adım 11
//(n-1)!
Adım 15:z=1
Adım 16:b=1
Adım 17:Eğer b>n-r git adım 21
Adım 18:z=z.b
Adım 19:b=b+1
Adım 20:Git adım 17

Adım 21:n!/(r!*(n-r)!) işlemi ile sonucu bul
Adım 22:Sonucu yaz
Adım 23:Bitir
 */
package homeworks;
import java.util.Scanner;
public class combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen n'i giriniz: ");
        int n=input.nextInt();
        int k=1;
        int x=1;
            while(k<=n){
            x=x*k;
            k=k+1;
    }//F1:n!
            System.out.print("Lütfen r'yi giriniz: ");
        int r=input.nextInt();
        int a=1;
        int y=1;
            while(a<=r){
            y=y*a;
            a=a+1;
    }//F2:r!
        int b=1;
        int z=1;
            while(b<=(n-r)){
            z=z*b;
            b=b+1;
    }//F3:(n-r)!
            int S =(int) (x/(y*z));
            System.out.println(+n+" elemanlı kümenin "+r+"'li kombinasyonları: "+S);
    }
    
}
