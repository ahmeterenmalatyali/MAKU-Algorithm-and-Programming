/*
->Klavyeden girilen NxN tipindeki A matrisinin he bir sütun elemanları şarpımından N elemanlı B dizisini oluşturan program
 */
package homeworks;
import java.util.Scanner;
public class week12_homework6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen A matrisinin satır ve sütun sayısını giriniz: ");
        int N=input.nextInt();
        int[][] A=new int[N][N];
        System.out.println("Lütfen A matrisinin elemanlarını giriniz: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j]=input.nextInt();                
            }
        }
        int[] B=new int[N];        
        for (int i = 0; i < N; i++) {
            int C=1;
            for (int j = 0; j < N; j++) {
                C*=A[i][j];
            }
            B[i]=C;
        }
        System.out.print("B:{");
        for (int i = 0; i < N; i++) {
            if (i==N-1) {
                System.out.print(B[i]+"}");
            }
            else{
                System.out.print(B[i]+",");
            }
        }
    }
    
}
