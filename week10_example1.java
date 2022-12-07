/*
->0-99 arası random sayılardan oluşan n değerli dizinin en küçüğünü ile en büyüğü bulma ve dizinin kaçıncı terimde olduğunu sayma
 */
import java.util.Scanner;
import java.util.Random;
public class week10_example1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random r=new Random();
        int n;
        do {
            System.out.print("Lütfen terim sayısını giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        
        //n uzunluğunda dizi tanımlama
        int[] randomdizi =new int[n];
        
        //randomdizi dizisine rastgele 0-99 arası sayılar atama
        for (int i = 0; i < randomdizi.length; i++) {
            randomdizi[i]=r.nextInt(100);            
        }
        
        //randomdizi dizisinde minimumu ve maksimumu bulma
        int min=randomdizi[0];
        int minsayac=1;
        int imin=0;
        int max=randomdizi[0];
        int maxsayac=1;
        int imax=0;
        for (int i = 1; i < randomdizi.length; i++) {
            if (min>randomdizi[i]) {
                min=randomdizi[i];
                minsayac=i+1;
                imin=i;
            }
            if (max<randomdizi[i]) {
                max=randomdizi[i];
                maxsayac=i+1;
                imax=i;
            }
        }
        System.out.print("Sayı dizisi={");
        
        //dizi terimlerini yazma
        for (int i = 0; i <= randomdizi.length-1; i++) {
            if (i==randomdizi.length-1) {
                System.out.print(randomdizi[i]+"}");
            }
            else{
                System.out.print(randomdizi[i]+" , ");
            }            
        }
        System.out.println();
        System.out.println("En küçük sayı , dizinin "+minsayac+". sayısı olan "+min+" ; indexi:"+imin);
        System.out.println("En büyük sayı , dizinin "+maxsayac+". sayısı olan "+max+" ; indexi:"+imax);
    }
    
}
