/*
Her satırda artan yıldızlar
*
**
***
****
*****
 */
import java.util.Scanner;
public class week5_example6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen satır sayısını giriniz: ");
        int row=input.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();//alt satıra geçer
    }
    
    }
}
