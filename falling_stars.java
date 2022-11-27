/*
Her satırda azalan yıldız
*/
package homeworks;
import java.util.Scanner;
public class falling_stars {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen satır sayısını giriniz: ");
        int row=input.nextInt();
        for (int i = row; i >0; i--) {
            for (int j = i; j >0; j--) {
                System.out.print("*  ");
            }
            System.out.println();
    }

    }
    
}
