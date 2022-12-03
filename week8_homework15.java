/*
->AB için (CB/AC)=(AB/CB) olacak şekilde altın oranı bulan program
Adım 1:Başlat AB uzunluğunu al
Adım 2:CB=2*AB/(1+5^(1/2))
Adım 3:AC=AB-CB
Adım 4:Yaz AC , CB
Adım 5:Bitir
 */
package homeworks;
import java.util.Scanner;
import java.lang.Math;
public class week8_homework15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double AB;
        do {
            System.out.print("Lütfen AB uzunluğunu giriniz: ");
            AB=input.nextInt();
        } while (AB<=0);
        double x=Math.sqrt(5);
        double CB =(2*AB)/(1+x);
        double AC=AB-CB;
        System.out.println("AC="+AC+" , "+"CB="+CB);
    }
    
}
