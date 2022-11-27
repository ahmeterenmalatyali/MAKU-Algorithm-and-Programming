/*
Girilen pozitif bir tamsayının , iki sayının kareleri toplamı şeklinde yazılıp yazılamayacağını hesaplayan program
Adım 1:Başlat
Adım 2:Kullanıcıdan pozitif bir tamsayı al (n)
Adım 3:Eğer i>n/2 ise git adım 10  
Adım 4:Eğer j>n/2 ise git adım 8
Adım 5:Eğer i*i+j*j=n ise yaz i*i+j*j=n
Adım 6:j=j+1
Adım 7:Git adım 4
Adım 8:i=i+1
Adım 9:Git adım 3
Adım 10:Bitir
 */
package homeworks;
import java.util.Scanner;
public class two_square {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N;
        do {
          System.out.println("Lütfen pozitif bir tamsayı giriniz: ");
          N=input.nextInt();
        } while (N<=0);
        for (int i = 0; i < N/2; i++) {
            for (int j = 0; j < N/2; j++) {
                if ((i*i)+(j*j)==N) {
                    System.out.println(+i+"²+"+j+"²="+N);
                    j+=1;
                }
            }
            i+=1;
        }
    }
    
}
