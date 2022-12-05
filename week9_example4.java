/*
DİZİLER
 */
import java.util.Scanner;
public class week9_example4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N;
        do {
            System.out.print("Lütfen dizi uzunluğu giriniz: ");
            N=input.nextInt();
        } while (N<=0);
        double[] dizi=new double[N];
        System.out.println("Dizinin uzunluğu: "+(dizi.length));
        
        for (int i = 0; i < N; i++) {
            System.out.print((i+1)+". sayı: ");
            dizi[i]=input.nextInt();
        }
        for (int i = 0; i < N; i++) {
            System.out.println((i+1)+". sayi: "+dizi[i]);
        }
        int T=0;
        for (int i = 0; i < N; i++) {
            T+=dizi[i];
        }
        System.out.println("Dizideki sayıların toplamı: "+T);
        System.out.println("Dizideki sayıların ortalaması"+T/dizi.length);
    }
    
}
