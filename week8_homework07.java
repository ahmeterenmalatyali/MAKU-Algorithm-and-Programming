/*
->Bilgisayarın ürettiği rastgele büyük harfin en fazla 10 denemede tahmin edilme oyunu programı
 */
package homeworks;
import java.util.Scanner;
import java.util.Random;
public class week8_homework07 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random rastgele=new Random();
        int x=rastgele.nextInt(25)+65;
        char harf=(char)x;
        for (int i = 1; i <= 10; i++) {
            System.out.println(+i+". tahmininiz: ");
            char tahmin=scan.next().charAt(0);
            if (tahmin==harf) {
                System.out.println(+i+" tahminde doğru harfe ulaştınız.");
            }
            if (i==10) {
                System.out.println("Tahmin hakkınız doldu harf: "+harf);
            }
        }
    }
    
}
