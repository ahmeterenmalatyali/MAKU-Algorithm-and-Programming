/*
->√5=2+1/t          t=4+1/(4+1/(4+1/.....)
Adım 1:Başlat
Adım 2:Klavyeden tekrar sayısı(n) gir
Adım 3:i=1,t=1
Adım 4:Eğer i>n ise git adım 8
Adım 5:t=4+1/t
Adım 6:i=i+1
Adım 7:Git adım 4
Adım 8:Yaz 2+1/t
Adım 9:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen tekrar sayısını giriniz: ");
            n=input.nextInt();
        } while (n<=0 || n%1!=0);
        double t=1;
        for (int i = 1; i < n; i++) {
            t=4+1/t;
        }
        System.out.println("√5="+(2+1/t));
    }
    
}
