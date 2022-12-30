/*
->Klavyeden girilen nxn tipindeki a matrisinden üst üçgen b matrisini oluşturan program
 */
package homeworks;
import java.util.Scanner;
public class week12_homework4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen A matrisinin sütun ve satır sayısını giriniz: ");
        int N=input.nextInt();
        int[][] A=new int[N][N];
        int[][] B=new int[N][N];
        System.out.println("Lütfen A matrisinin elemanlarını giriniz: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i <N ; i++) {
            for (int j = i; j < N; j++) {
                B[i][j]=A[i][j];
            }
        }
        System.out.println("B:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
