/*
Klavyeden girilen NxN tipindeki A matrisinin ana köşegeninin üst kısmında kalan elemanların toplamını hesaplayan program
 */
import java.util.Scanner;
public class week12_example4 {
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
        int T=0;
        for (int i = 0; i < rcol; i++) {
            for (int j = 0; j < rcol; j++) {
                if (j>i) {
                    T+=A[i][j];
                }
            }
        }
        System.out.println("Ana köşegen üzeri toplam="+T);
    }
    
}
