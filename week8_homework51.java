/*
-> 1
   2  3
   4  5  6
Yazan program(Floyd üçgeni)
Adım 1:Başlat
Adım 2:Klavyeden satır sayısı(n) al
Adım 3:i=1,s=1
Adım 4:Eğer i>n ise git adım 14
Adım 5:j=1
Adım 6:Eğer j=>i ise git adım 11
Adım 7:Yaz s
Adım 8:s=s+1
Adım 9:j=j+1
Adım 10:Git adım 6
Adım 11:i=i+1
Adım 12:alt satır
Adım 13:Git adım 4
Adım 14:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework51 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen satır sayısını giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        int s=1;
        for (int i = 1; i <= n; i++) {            
            for (int j = 1; j <= i; j++) {
                System.out.print(+s+"  ");
                s=s+1;
            }
            System.out.println();
        }
    }
    
}
