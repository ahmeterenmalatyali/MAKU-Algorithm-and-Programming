/*
->Klavyeden n elemanlı a ve b dizilerinin skaler çarpımını hesaplayan program 
 */
package homeworks;
import java.util.Scanner;
public class week10_homework1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen terim sayısını giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        int [] A=new int [n];
        for (int i = 0; i < n; i++) {
            System.out.print("A kümesinin "+(i+1) +". elemanı: ");
            A[i]=input.nextInt();
        }
        int [] B=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("B kümesisinin "+(i+1) +". elemanı: ");
            B[i]=input.nextInt();
        }
        int T=0;
        for (int i = 0; i < n; i++) {
            T+=A[i]*B[i];
        }
        System.out.println("A.B="+T);
    }
    
}
