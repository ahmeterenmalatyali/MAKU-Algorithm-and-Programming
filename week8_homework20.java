/*
->Klavyeden girilen 1'den büyük tamsayının aaal çarpanlarını bulan program
Adım 1:Başlat
Adım 2:Klavyeden 1'den büyük N tamsayısı al
Adım 3:a=2
Adım 4:Eğer a>N ise git adım 14
Adım 5:asalmı yı doğru kabul et
Adım 6:i=2 
Adım 7:Eğer i>=a ise git adım 11
Adım 8:Eğer a%i=0 asalmı yanlış
Adım 9:i=i+1
Adım 10:Git adım 7
Adım 11:Eğer asalmı doğru ve a=!1 ve N%a=0 ise yaz a
Adım 12:a=a+1
Adım 13:Git adım 4
Adım 14:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        do {
            System.out.print("Lütfen pozitif bir tamsayı giriniz: ");
            N = input.nextInt();
        } while (N<=0);
        for (int a= 2 ; a <= N; a++) {
            boolean asalmi = true; //varsayım/asal olursa
            for (int i = 2; i < a; i++){
                if (a%i ==0) {
                    asalmi=false;
                
                }
            }
            if (asalmi==true && a!=1 && N%a==0) {
                System.out.println(a);
            }
        }
    }
    
}
