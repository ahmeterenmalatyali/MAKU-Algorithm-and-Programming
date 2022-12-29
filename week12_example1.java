/*
Dışardan satır ve sütün sayısı alınarak 2 dizi tanımlanır ve elemanları klavyeden girilir
 */
import java.util.Scanner;
public class week12_example1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen A kümesinin satır sayısını giriniz: ");
        int arow =input.nextInt();
        System.out.print("Lütfen A kümesinin sütun sayısını giriniz: ");
        int acol =input.nextInt();
        System.out.print("Lütfen B kümesinin satır sayısını giriniz: ");
        int brow =input.nextInt();
        System.out.print("Lütfen B kümesinin sütun sayısını giriniz: ");
        int bcol =input.nextInt();
        int[][] A=new int[arow][acol];//A ve B matrisinin [satır sayısı][sütun sayısı]
        int[][] B=new int[brow][bcol];
        
        
        System.out.println("Lütfen A kümesinin elemanlarını giriniz: ");
        for (int i = 0; i < arow; i++) {
            for (int j = 0; j < acol; j++) {
                A[i][j]=input.nextInt();
            }
        }
        
        
        System.out.println("Lütfen B kümesinin elemanlarını giriniz: ");
        for (int i = 0; i < brow; i++) {
            for (int j = 0; j < bcol; j++) {
                B[i][j]=input.nextInt();
            }
        }
        
        
        System.out.println("A:");
        for (int i = 0; i < arow; i++) {
            for (int j = 0; j < acol; j++) {
                if (j==acol-1) {
                    System.out.print(+A[i][j]); 
                }
                else{
                    System.out.print(+A[i][j]+" , ");
                }               
            }
            System.out.println();
        }
        
        
        System.out.println("B:");
        for (int i = 0; i < brow; i++) {
            for (int j = 0; j < bcol; j++) {
                if (j==bcol-1) {
                    System.out.print(+B[i][j]); 
                }
                else{
                    System.out.print(+B[i][j]+" , ");
                }               
            }
            System.out.println();
        }
    }
    
}
