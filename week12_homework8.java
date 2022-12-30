/*
->Klavyeden girilen NxN tipindeki A matrisinin her bir satır elemanlarını kendi aralarında küçükten büyüğe doğru sıralayan program
 */
package homeworks;
import java.util.Scanner;
public class week12_homework8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen A matrisinin satır ve süyun sayısını giriniz: ");
        int N=input.nextInt();
        int[][] A=new int[N][N];
        System.out.println("Lütfen A matrisinin elemanlarını giriniz: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j]=input.nextInt();
            }
        }
        int[]B=new int[N];
        int[][] newA=new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[j]=A[i][j];                
            }
            for (int j = 0; j < N; j++) {
                int min=B[j];
                for (int k = j+1; k < N; k++) {
                    if (min>B[k]) {
                        int u=min;
                        min=B[k];
                        B[k]=u;
                    }                    
                }
                newA[i][j]=min;
            }
        }
        System.out.println("newA:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(newA[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
