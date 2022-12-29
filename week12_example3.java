/*
A ve B matrislerinin çarpımı
 */
import java.util.Scanner;
public class week12_example3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen A kümesinin satır sayısını giriniz: ");
        int arow =input.nextInt();
        System.out.print("Lütfen A kümesinin sütununu ve B kümesinin satırını sayısını giriniz: ");
        int acolbrow =input.nextInt();
        System.out.print("Lütfen B kümesinin sütun sayısını giriniz: ");
        int bcol =input.nextInt();
        System.out.println("Lütfen A kümesinin elemanlarını giriniz: ");
        int[][] A=new int[arow][acolbrow];
        for (int i = 0; i < arow; i++) {
            for (int j = 0; j < acolbrow; j++) {
                A[i][j]=input.nextInt();
            }
        }
        
        int[][] B=new int[acolbrow][bcol];
        System.out.println("Lütfen B kümesinin elemanlarını giriniz: ");
        for (int i = 0; i < acolbrow; i++) {
            for (int j = 0; j < bcol; j++) {
                B[i][j]=input.nextInt();
            }
        }
        
        
        //Matris Çarpımı
        System.out.println("C:");
        int[][] C=new int[arow][bcol];
        for (int i = 0; i < arow; i++) {
            for (int j = 0; j < bcol; j++) {
                for (int k = 0; k < bcol; k++) {
                    C[i][j] +=A[i][k]*B[k][j];
                }
            }    
        }
        for (int i = 0; i < arow; i++) {
            for (int j = 0; j < bcol; j++) {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
