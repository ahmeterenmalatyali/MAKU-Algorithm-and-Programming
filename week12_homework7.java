/*
->Klavyeden NxN tipindeki A matrisinin simetrik olup olmadığını kontrol eden program
 */
package homeworks;
import java.util.Scanner;
public class week12_homework7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen matrisin satır ve sütün sayısını giriniz: ");
        int N =input.nextInt();
        int[][] A=new int[N][N];
        System.out.println("Lütfen A matrisinin elemanlarını giriniz");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j]=input.nextInt();
            }
        }
        boolean simetrik=true;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] != A[j][i]) {
                    simetrik=false;
                }
            }
        }
        if (simetrik==true) {
            System.out.println("A matrisi simetriktir");
        }
        else{
            System.out.println("A matrisi simetrik değildir");
        }
    }
    
}
