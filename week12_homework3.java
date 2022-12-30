/*
->Klavyeden girilen NxN tipindeki A matrisinin sondan bir önceki satır ve sütundaki elemanların toplamını hesaplayan program
 */
package homeworks;
import java.util.Scanner;
public class week12_homework3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen A matrisinin sütun ve satır sayısını giriniz: ");
        int N=input.nextInt();
        int[][] A=new int[N][N];
        System.out.println("Lütfen A matrisinin elemanlarını giriniz: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j]=input.nextInt();
            }
        }
        int T=0;
        for (int i = 0; i < N-1; i++) {
            T+=A[i][N-2];
        }
        for (int j = 0; j < N-2; j++) {
            T+=A[N-2][j];
        }
        System.out.println("A matrisinin sondan bir önceki satır ve sütundaki elemanların toplamı: "+T);
    }
    
}
