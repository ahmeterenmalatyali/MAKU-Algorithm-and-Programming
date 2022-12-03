/*
->Bilgisayarın ürettüğü 1 ile 99 arasındaki sayıyı tahmin etme
 */
package homeworks;
import java.util.Scanner;
public class week8_homework06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int min =1;
        int max =99;
        int R=(int)(Math.random()*(max-min+1)+min);
        int deneme=0;
        while(true)
        {
            System.out.print("Lütfen 1-99 arası sayı giriniz: ");
            int sayi=input.nextInt();
            deneme++;
            if (sayi>R) {
                System.out.println("Lütfen daha küçük bir sayı giriniz");
            }
            else if (sayi<R) {
                System.out.println("Lütfen daha büyük bir sayı giriniz");
            }
            else if (sayi==R) {
                System.out.println("Tebrikler doğru tahmin");
                break;
            }
        }
        System.out.println(deneme+" kadar tahminde doğru sonuca ulaştınız");
    }
    
}
