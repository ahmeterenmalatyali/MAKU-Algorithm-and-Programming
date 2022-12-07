/*
->Klavyeden girilen terim sayısı kadar fibonacci dizisi yazan program
 */
import java.util.Scanner;
public class week10_example4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen dizinin terim sayısını giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        int [] fibonaccidizisi=new int[n];
        int a=1;
        int b=1;
        int c;
        for (int i = 0; i < n; i++) {
            fibonaccidizisi[i]=a;
            c=a+b;
            a=b;
            b=c;
        }
        System.out.print("Fibonacci dizisi={");
        for (int i = 0; i < n; i++) {
            if (i==n-1) {
                System.out.print(fibonaccidizisi[i]+"} ");
            }
            else{
                System.out.print(fibonaccidizisi[i]+" , ");
            }
        }
    }
    
}
