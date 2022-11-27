/*
Satır ve sütunu kullanıcıdan alıp sayıya göre yıldız yap 
 */
import java.util.Scanner;
public class week5_example5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen satır sayısını giriniz: ");
        int row=input.nextInt();
        System.out.print("Lütfen sütun sayısını giriniz: ");
        int col=input.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("*  ");
            }
            System.out.println();//alt satıra geçer
        }
    }
    
}
