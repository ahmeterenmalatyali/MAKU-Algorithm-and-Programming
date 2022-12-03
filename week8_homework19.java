/*
->Her iki basamağında asal sayı olan iki basamaklı sayıları listeleyen program
Adım 1:Başlat
Adım 2:N=19
Adım 3:Eğer N>99 git adım 19
Adım 4:N%10=k1
Adım 5:asalmi1=true,asalmi2=true
Adım 6:i=2
Adım 7:Eğer i>=k1 ise git adım 11
Adım 8:Eğer k1%i=0 ise asalmi1=false 
Adım 9:i=i+1
Adım 10:Git adım 7
Adım 11:N/10=k2
Adım 12:j=2
Adım 13:Eğer j>=k2 ise git adım 17
Adım 14:Eğer k2%j=0 ise asalmi2=false 
Adım 15:j=j+1
Adım 16:Git adım 13
Adım 17:Eğer asalmi1=true ve asalmi2=true ise yaz N
Adım 18:N=N+1
Adım 19:Bitir
*/
package homeworks;
public class week8_homework19 {
    public static void main(String[] args) {
        for (int N = 19; N < 99; N++) {
            int k1=N%10;
            boolean asalmi1=true;
            boolean asalmi2=true;
            for (int i = 2; i < k1; i++) {
                if (k1%i==0) {
                    asalmi1=false;
                }
            }
            int k2=N/10;
            for (int j = 2; j < k2; j++) {
                if (k2%j==0) {
                    asalmi2=false;
                }
            }
            if (asalmi2==true && asalmi1==true && N%10!=0 && N%10!=1) {
                System.out.print(+N+" , ");
            }
        }
    }
    
}
