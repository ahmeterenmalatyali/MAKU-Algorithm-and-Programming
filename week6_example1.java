/*
******
 *****
  ****
   ***
    **
     *
 */
import java.util.Scanner;
public class week6_example1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen satır sayısı giriniz");
        int row=input.nextInt();
        for (int i = row; i >0; i--) {
            for (int j = 0; j <row-i; j++) {
                System.out.print(" ");
            }
            for (int k = row-i; k <row; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
