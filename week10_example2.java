/*
->Klavyeden girilen n elemanlı A dizisinin elemanlarını başka bir dizi kullanmadan tersten yerleştiren program
 */
import java.util.Scanner;
import java.util.Random;
public class week10_example2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random r=new Random();
        int n;
        do {
            System.out.print("Lütfen terim sayısı giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        int[] randomdizi =new int[n];
        for (int i = 0; i < randomdizi.length; i++) {
            randomdizi[i]=r.nextInt(100);            
        }
        System.out.print("dizi={");
        for (int i = 0; i < randomdizi.length; i++) {
            if (i==randomdizi.length-1) {
                System.out.print(+randomdizi[i]+"}");
            }
            else{
                System.out.print(+randomdizi[i]+" , ");
            }          
        }
        for (int i = 0; i < randomdizi.length/2; i++) {
            int a=randomdizi[i];
            randomdizi[i]=randomdizi[n-1-i];
            randomdizi[n-1-i]=a;
        }
        System.out.println();
        System.out.print("dizinin tersi={");
        for (int i = 0; i < randomdizi.length; i++) {
            if (i==randomdizi.length-1) {
                System.out.print(+randomdizi[i]+"}");
            }
            else{
                System.out.print(+randomdizi[i]+" , ");
            }          
        }
    }
    
}
