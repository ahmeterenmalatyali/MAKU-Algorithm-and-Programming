import java.util.Scanner;
import java.util.Random;
public class week12_example6v2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen kaç ders olduğunu giriniz" );
        int d=input.nextInt();
        System.out.println("Öğrenci sayısı");
        int o=input.nextInt();
        int[][] notlar=new int[o][d];

        int[] ogrencino=new int[o];
        double[] ortalama=new double[d];
        int[][] rapor=new int[d][4];

        //random öğrenci id oluştualım
        Random r=new Random();
        for (int i = 0; i<o ; i++) {
            ogrencino[i]=(int)(10000+(20000-10000)*r.nextDouble());
        }

        //rastgele not dizisini atama (0-99 arası)
        for (int i=0 ; i<d ; i++) {
            for (int j=0 ; j<o ; j++) {
                notlar[i][j]=r.nextInt(100);
            }
        }


        //ortalamaları hesaplama
        for (int i=0 ; i<d ; i++) {
            int toplam=0;
            for (int j=0 ; j<o ; j++) {
                toplam += notlar[i][j];
            }
            ortalama[i]=(double)toplam/o;
            System.out.println(i +". dersin ortalaması "+ortalama +" , " +ortalama[i]);
        }


        //derse ait max-min bulma
        for (int i=0 ; i<d ; i++) {
            int max=notlar[i][0], min=notlar[i][0];
            int maxid=0, minid=0;
            for (int j=0 ; j<o ; j++) {
                if(notlar[i][j]>max){
                    maxid=ogrencino[j];
                    max=notlar[i][j];
                }
                else if(notlar[i][j]<min){
                    minid=ogrencino[i];
                    min=notlar[i][j];
                }
            }
            rapor[i][0]=max; rapor[i][1]=maxid; rapor[i][2]=min; rapor[i][3]=minid;
        }
        for (int i=0 ; i<o ; i++) {
            for (int j=0 ; j<d  ; j++) {
                System.out.println(ogrencino[i] +" nolu öğrencinin " +j +". dersinde aldığı not: "+notlar[i][j]);

            }
        }
        for (int i = 0; i<d; i++) {
            System.out.println(i +" numaralı ders için");
            System.out.println("Maximum not "+rapor[i][0] +"  Notu alan öğrenci " +rapor[i][1] +"  Minimum not " +rapor[i][2] +" Notu alan öğrenci " +rapor[i][3]);
                    
       }
    }    
}
