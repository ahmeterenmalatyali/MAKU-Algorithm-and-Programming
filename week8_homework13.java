/*
->√3=1+1/t       t=1+1/(2+1/1+1/2+1/.....)
Adım 1:Başlat 
Adım 2:Klavyeden tekrar sayısı(n) al
Adım 3:i=1,t=1
Adım 4:Eğer i>n ise git adım 9
Adım 5:Eğer i%2!=0 ise t=1+1/t
Adım 6:Aksi taktirde t=2+1/t
Adım 7:i=i+1
Adım 8:Git adım 4
Adım 9:Yaz 1+1/t
Adım 10:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen tekrar saıyısını giriniz: ");
            n=input.nextInt();
        } while (n<=0 || n%1!=0);
        double t=1;
        for (int i = 1; i <= n; i++) {
            if (i%2!=0) {
                t=1+1/t;
            }
            else{
                t=2+1/t;
            }
        }
        System.out.println("√3="+(1+1/t));
    }
    
}
