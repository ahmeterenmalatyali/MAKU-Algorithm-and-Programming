/*
Faktöriyel
Adım 1:Başlat
Adım 2:Klavyeden n! için n gir
Adım 3:F=1
Adım 4:k=1
Adım 5:Eğer k>n git adım 9
Adım 6:F=F.k
Adım 7:k=k+1
Adım 8:Git adım 5
Adım 9:Yaz F
Adım 10:Bitir
*/
import java.util.Scanner;
public class week4_example2 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen n! inin n'i giriniz: ");//print yazarsak oduğu satıra yazarız
        double n=input.nextDouble();
        double k=1;
        double F=1;
            while(k<=n){
            F=F*k;
            k=k+1;
    }
    System.out.println(+n+"!="+F);
}
}