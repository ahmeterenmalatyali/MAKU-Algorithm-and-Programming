/*
N kişilik sınıfın M tane dersine ait notları , bilgisayara girilmektedir.Buna göre;
I.Herbir dersten sınıf ortalamasını
II.Herbir dersten en düşük ve en yüksek not ile bu notu alan öğrenci numaralarını veren program
*/
import java.util.Scanner;
public class week12_example6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen öğrenci saysını giriniz: ");
        int row=input.nextInt();
        System.out.println("Lütfen ders sayısı giriniz:");
        int col=input.nextInt();
        int[][] Not=new int[row][col];
        System.out.println("Lütfen öğrenci notlarını giriniz:");
        for (int i = 0; i < row; i++) {
            int j=0;
            do {
                Not[i][j]=input.nextInt();
                if (Not[i][j]>=0 && Not[i][j]<=100) {
                    j++;
                }
            } while (j<col);
            
        }
        int T=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                T+=Not[i][j];                
            }
            System.out.print(+i+1+". dersin ortalaması:"+(double)(T/row));
        }
        int maxrow=0,maxcol=0,minrow=0,mincol=0;
        int maxnot =Not[0][0],minnot=Not[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (Not[i][j]>maxnot) {
                    maxnot=Not[i][j];
                    maxrow=i;maxcol=j;
                }
                if (Not[i][j]<minnot) {
                    minnot=Not[i][j];
                    minrow=i;mincol=j;
                }
            }
        }
        System.out.println("maxnot "+maxrow+1+" numaralı  öğrenci "+maxcol+1+". dersten aldığı not :"+maxnot);
        System.out.println("minnot "+minrow+1+" numaralı öğrenci "+mincol+1+". dersten aldığı not :"+minnot);
    }
    
}
