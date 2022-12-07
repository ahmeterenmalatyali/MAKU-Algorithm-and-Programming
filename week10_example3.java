/*
->n kişişik bir sınıfın herhangi bir dersten yılsonu notlarını girilmektedir.Buna göre sınıf ortalamasının altında kalanlara kaldı , diğerlerine geçti yazan program
 */
import java.util.Scanner;
public class week10_example3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen öğrenci sayısı giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        int[] notlar =new int[n];
        double T=0;
        int i=0;
        do {
            do {
                System.out.print(+i+1+". not:");
                notlar[i]=input.nextInt();
            } while (notlar[i]<0 || notlar[i]>100); 
            T+=notlar[i];
            i=i+1;
        } while (i<notlar.length );
        double ort=T/n;
        System.out.println("Sınıf ortalaması="+ort);
        int s1=0;
        int s2=0;
        for (int j = 0; j < n; j++) {
            if (notlar[j]<ort) {
                System.out.println(notlar[j]+" ile kaldı");
                s1+=1;
            }
            else if (notlar[j]>=ort) {
                System.out.println(notlar[j]+" ile geçti");
                s2+=1;
            }
            System.out.println("Sınıfta "+s1+" kişi kaldı");
            System.out.println("Sınıftan "+s2+" kişi geçti");
        }
        
        
    }
    
}
