/*
1'den N'e kadar olan tek ve çift sayıların toplamı
Adım 1:Başlat
Adım 2:N sayısı al
Adım 3:S=1
Adım 4:T=0
Adım 5:C=0
Adım 6:Eğer S>N ise git adım 11
Adım 7:Eğer S%2!=0 ise T=T+S
Adım 8:Aksi taktirde C=C+S
Adım 9:S=S+1
Adım 10:Git adım 6
Adım 11:Yaz T ve C
Adım 12:Bitir
*/
import java.util.Scanner;
public class week4_example1 {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("Lütfen bir N sayısı giriniz");
int N = input.nextInt();
int S=1;
int T=0;
int C=0;
while (S<=N){
    if (S%2!=0) {
        T=T+S;
    }
   
    else {
        C=C+S;
        
    } 
    S=S+1;
}
System.out.println("Tek sayıların toplamı: "+T +", Çift sayıların toplamı: "+C);
    }
    
}
