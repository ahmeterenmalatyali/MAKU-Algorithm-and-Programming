/*
->Basamakları toplamı fibonacci sayısı olan 0-99 arasındaki tamsayıları inceleyen
Adım 1:Başlat
Adım 2:i=1
Adım 3:Eğer i>99 ise git adım 13
Adım 4:S=i%10+i/10
Adım 5:a=1,b=1
Adım 6:Eğer c>13 ise git adım 11
Adım 7:c=a+b
Adım 8:a=b,b=c
Adım 9:Eğer S=c ise Yaz i ve git adım 11
Adım 10:Git adım 6
Adım 11:i=i+1
Adım 12:Git adım 3
Adım 13:Bitir
 */
package homeworks;
public class week8_homework44 {
    public static void main(String[] args) {
        System.out.print("1 ");
        for (int i = 1; i <= 99; i++) {
            int S=(i%10)+(i/10);
            int a=1;
            int b=1;
            int c=0;
            while (c<=13){
                c=a+b;
                a=b;
                b=c;
                if (S==c) {
                    System.out.print(", "+i+" ");
                    break;
                }
            }            
        }
    }
    
}
