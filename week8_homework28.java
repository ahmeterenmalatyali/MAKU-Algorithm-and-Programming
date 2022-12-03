/*
->Klavyeden girilen pozitif tamsayının hilbert sayısı olup olmadığını bulan program
Hilbert sayısı:4*k+1 şeklinde yazılabilen pozitif tamsayılar
Adım 1:Başlat
Adım 2:Kullanıcıdan pozitif tamsayı(n) al
Adım 3:i=0
Adım 4:Eğer i>n/2 ise git adım 8
Adım 5:Eğer 4*i+1=n ise yaz hilbert sayısıdır
Adım 6:i=i+1
Adım 7:Git adım 4
Adım 8:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework28 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean hilsayi=false;
        int n;
        do {
            System.out.print("Lütfen pozitif bir tamsayı giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        for (int i = 0; i < n/2; i++) {
            if (4*i+1==n) {
                hilsayi=true;
            }
        }
        if (hilsayi==true) {
            System.out.println(+n+ " hilbert sayısıdır.");
        }
        else{
            System.out.println(+n+" hilbert sayısı değildir.");
        }
    }
    
}
