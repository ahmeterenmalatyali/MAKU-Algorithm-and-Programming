/*
Bilgisayarın seçtiği 1 ile 100 arasındaki sayıyı tahmin etme
 */
import java.util.Scanner;
public class week6_example4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int min =1;
        int max =99;
        int R=(int)(Math.random()*(max-min+1)+min);//bilgisayardan belli aralıkta rastgele sayı isteme
        /*
        Random r=new Random();
        int randomsayi = r.nextInt(99)+1   //+1 olmazsa 0 ile 99 arası seçer
        */
        int deneme=0;
        while(true)//koşulsuz döngü
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
                break;//döngüden çıkar
            }
        }
        System.out.println(deneme+" kadar tahminde doğru sonuca ulaştınız");
    }
    
}
