/*
******
*    *
*    *
*    *
*    *
******
 */
import java.util.Scanner;
public class week6_example3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz");
        int satir=input.nextInt();
        System.out.println("Lütfen sütun sayısı giriniz");
        int sutun=input.nextInt();
        for (int i = 0; i < sutun; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int j = satir-2; j >0; j--) {
            System.out.print("*");
            for (int k = 0; k < sutun-2; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < sutun; i++) {
            System.out.print("*");
        }
    }
    
}
