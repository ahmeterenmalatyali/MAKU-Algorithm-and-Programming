/*
     *
    **
   ***
  ****
 *****
******
 */
import java.util.Scanner;
public class week6_example2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen satır sayısı girin");
        int row=input.nextInt();
        for (int i = row; i >0 ; i--) {
            for (int j = i; j >1 ; j--) {
                System.out.print(" ");    
            }
            for (int k = row-i; k >= 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
