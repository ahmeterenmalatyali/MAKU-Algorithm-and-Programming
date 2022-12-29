/*
Klavyeden girilen NxN tipindeki A matrısının en büyük ve en küçük elemanların yerlerini bulup sonuçları ekrana yazdıran program
 */
import java.util.Scanner;
public class week12_example5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen A kümesinin satır ve sütununu giriniz: ");
        int rcol=input.nextInt();
        int[][] A=new int[rcol][rcol];
        System.out.println("Lütfen A kümesinin elemanlarını giriniz:");
        for (int i = 0; i < rcol; i++) {
            for (int j = 0; j < rcol; j++) {
                A[i][j]=input.nextInt();
            }
        }
        int maxrow=0,maxcol=0,minrow=0,mincol=0;
        int maxelement =A[0][0],minelement=A[0][0];
        for (int i = 0; i < rcol; i++) {
            for (int j = 0; j < rcol; j++) {
                if (A[i][j]>maxelement) {
                    maxelement=A[i][j];
                    maxrow=i;maxcol=j;
                }
                if (A[i][j]<minelement) {
                    minelement=A[i][j];
                    minrow=i;mincol=j;
                }
            }
        }
        System.out.println("max element "+maxrow+1+". satırdaki ve "+maxcol+1+". sütundaki :"+maxelement);
        System.out.println("min element "+minrow+1+". satırdaki ve "+mincol+1+". sütundaki :"+minelement);
    }    
}
