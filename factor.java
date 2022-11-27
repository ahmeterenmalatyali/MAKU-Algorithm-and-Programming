/*
Girilen sayının tam bölenlerini bulma
Adım 1:Başlat
Adım 2:Kullanıcıdan bir N tamsayısı al
Adım 3:Eğer k=0 ise git adım 8
Adım 4:k=-N
Adım 5:Eğer N%k==0 ise yaz k
Adım 6:k=k+1
Adım 7:Git adım 3
Adım 8:Eğer k>N ise git adım 12
Adım 9:k=k+1
Adım 10:Eğer N%k==0 ise yaz k
Adım 11:Git adım 8
Adım 12:Bitir
 */
package homeworks;
import java.util.Scanner;
public class factor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int N=input.nextInt();
        System.out.println(+N+" sayısının tam bölenleri:");
        for (int k=-N;k<0;k++) {
            if (N%k==0) {
                System.out.print(+k+" ");
            }
        }
        for (int k=1;k<=N;k++) {
            if (N%k==0) {
                System.out.print(+k+" ");
            }
        }
        
    }
    
}
