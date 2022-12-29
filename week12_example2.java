/*
A ve B matrislerinin toplamı
*/
import java.util.Scanner;
public class week12_example2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen A ve B kümesinin satır sayısını giriniz: ");
        int row =input.nextInt();
        System.out.print("Lütfen A ve B  kümesinin sütun sayısını giriniz: ");
        int col =input.nextInt();
        int[][] A=new int[row][col];
        int[][] B=new int[row][col];
        int[][] C=new int[row][col];
        System.out.println("Lütfen A kümesinin elemanlarını giriniz: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                A[i][j]=input.nextInt();
            }
        }
        
        
        System.out.println("Lütfen B kümesinin elemanlarını giriniz: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                B[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
