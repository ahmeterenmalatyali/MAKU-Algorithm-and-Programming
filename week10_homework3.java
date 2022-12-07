/*
->Klavyeden girilen n. dereceden y(c)=(an*x^n)+(a(n-1)*x^(n-1))+...+a*x polinomunu için y(b)'yi bulan program
 */
package homeworks;
import java.util.Scanner;
import java.lang.Math;
public class week10_homework3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen terim sayısını giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        int [] A=new int [n];
        System.out.println("Lütfen b'yi giriniz: ");
        int b=input.nextInt();
        System.out.println("Lütfen katsayıları giriniz");
        int T=0;
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) +". katsayı: ");
            A[i]=input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            double x=Math.pow(b,i+1);
            T+=x*A[i];
        }
        System.out.println("y("+b+")="+T);
    }
    
}
