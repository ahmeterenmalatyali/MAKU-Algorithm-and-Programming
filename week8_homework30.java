/*
->100-199 arasındaki armstrong sayılarını yazan program
Armstrong sayı:Basamağı kadar basamaklarındaki sayılarının çarpımının toplamı kendine eşit olan sayılar
Adım 1:Başlat
Adım 2:i=100
Adım 3:Eğer i>999 ise git adım 13
Adım 4:i=s,T=0
Adım 5:Eğer s<=0 ise git adım 10
Adım 6:s%10=k
Adım 7:s=s/10
Adım 8:T=T+k^3
Adım 9:Git adım 5
Adım 10:Eğer T=i se yaz i
Adım 11:i=i+1
Adım 12:Git adım 3
Adım 13:Bitir
 */
package homeworks;
import java.lang.Math;
public class week8_homework30 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int s=i;
            double T=0;
            while (s>0){
                int k=s%10;
                s=s/10;
                double x=Math.pow(k,3);
                T=T+x;
            }
            if (T==i) {
                System.out.print(i+" ,");
            }
        }
    }
    
}
