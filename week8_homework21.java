/*
->Klavyeden girilen sayının Chen asalı olup olmadığını bulan program
Adım 1:Başlat
Adım 2:Klavyeden n pozitif tamsayısı al
Adım 3:i=2
Adım 4:Eğer i>n ise git adım 9
Adım 5:asal kabul et
Adım 6:Eğer n%i=0 ise asal yanlış kabul et
Adım 7:i=i+1
Adım 8:Git adım 4
Adım 9:a=n+2,j=2
Adım 10:Eğer j>a git adım 15
Adım 11:chenasalımı doğru kabul et
Adım 12:Eğer a%h=0 ise chenasalı yanlış kabul et
Adım 13:j=j+1
Adım 14:Git adım 10
Adım 15:Eğer asal ve chenasalı ise chen asalıdır yaz
Adım 16:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework21 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen pozitif bir sayı giriniz: ");
            n = input.nextInt();
        } while (n<=0);
        
        boolean asalmi = true; //varsayım/asal olursa
        for (int i = 2; i < n; i++){
            if (n%i ==0) {
                asalmi=false;
                
            }
        
        }
        int a = n+2;
        boolean chenasalimi = true; //varsayım/asal olursa
        for (int j = 2; j < a; j++){
            if (a%j ==0) {
                asalmi=false;
                
            }
        }
        if (asalmi==true && n!=1 && chenasalimi==true) {
            System.out.println(+n+" chen asalıdır");
        }
        else {
            System.out.println(+n+" chen asalı değildir");
        }
    }
    
}
