/*
->Klavyeden girilen n elemanlı A dizisinin aritmetik , geometrik , harmonik ve kontraharmonik ortalamasını hesaplayan program
 */
package homeworks;
import java.util.Scanner;
import java.lang.Math;
public class week10_homework2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen terim sayısını giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        int [] A=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A dizisinin "+(i+1) +". elemanı:");
            A[i]=input.nextInt();
        }
        double T=0;
        double C=1;
        double H=0;
        double TK=0;
        for (int i = 0; i < n; i++) {
            T+=A[i];
            C=C*A[i];
            H+=(double)1/A[i];
            TK+=A[i]*A[i];
        }
        double k=Math.pow(C,(double)1.0/n);
        double AO=T/n;
        double GO=k;
        double HO=n*(double)1/H;
        double KO=TK/T;
        System.out.println("Aritmetik ortalama: "+AO);
        System.out.println("Geometrik ortalama: "+GO);
        System.out.println("Harmonik ortalama: "+HO);
        System.out.println("Kontraharmonik Ortalama: "+KO);
    }
    
}
