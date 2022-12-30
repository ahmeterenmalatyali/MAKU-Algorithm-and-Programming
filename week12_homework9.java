/*
->N tane şirketin bir yıla ait aylık kâr oranları,bilgisayara girilmektedir.Buna göre;
I.Herbir şirketin yıllık ortalama kâr miktarlarını,
II.Herbir şirketin en az ve en fazla kâr elde ettiği ayları ve miktarlarını,
III.Herbir aya ait en az ve en fazla kâr miktarları ve şirketleri veren program
 */
package homeworks;
import java.util.Scanner;
public class week12_homework9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        //A matrisini oluşturma
        System.out.println("Lütfemn şirket sayısını giriniz: ");
        int N=input.nextInt();
        int[][] A=new int[N][12];
        System.out.println("Lütfen şirketin 12 aylık kâr oranlarını giriniz: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 12; j++) {
                A[i][j]=input.nextInt();
            }
        }
        System.out.println("şirketlerin aylık tablosu:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(A[i][j]+"  ");
            }
            System.out.println();
        }
        
        
        //I.soru
        for (int i = 0; i < N; i++) {
            int T=0;
            for (int j = 0; j < 12; j++) {
                T+=A[i][j];                                
            }
            double ort=T/12;
            System.out.println(+i+1+". şirketin ortalama kar oranı %"+ort);
        }
        
        //II.soru
        for (int i = 0; i < N; i++) {
            int min=1,max=1,minkar=A[i][0],maxkar=A[i][0];
            for (int j = 1; j < 12; j++) {
                if (minkar>A[i][j]) {
                    minkar=A[i][j];
                    min=j+1;
                }
                if (maxkar<A[i][j]) {
                    maxkar=A[i][j];
                    max=j+1;
                }
            }
            System.out.println(+i+1+". şirket için max kar oranı: "+max+". ayda %"+maxkar);
            System.out.println(+i+1+". şirket için min kar oranı: "+min+". ayda %"+minkar);
        }
        
        //III.soru
        for (int i = 0; i < 12; i++) {
            int min=1,max=1,minkar=A[0][i],maxkar=A[0][i];
            for (int j = 1; j < N; j++) {
                if (minkar>A[j][i]) {
                    minkar=A[j][i];
                    min=j+1;
                }
                if (maxkar<A[j][i]) {
                    maxkar=A[j][i];
                    max=j+1;
                }
            }
            System.out.println(+i+1+". ay için max kar oranı: "+max+". şirkette %"+maxkar);
            System.out.println(+i+1+". ay için min kar oranı: "+min+". şirkette %"+minkar);
        }
    }
    
}
