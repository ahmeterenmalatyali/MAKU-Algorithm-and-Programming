/*
Alınan b sayısına göre b=a³-a² şartını sağlayan 0<a<100 tamsayısını bulan program
Adım 1:Başlat
Adım 2:Klavyeden b al
Adım 3:a=1
Adım 4:Eğer a=100 ise git adım 8
Adım 5:Eğer b=a*a*a-a*a ise yaz a
Adım 6:a=a+1
Adım 7:git adım 4
Adım 8:Bitir
*/
import java.util.Scanner;
public class week5_example3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen b sayısı giriniz: ");
        int b =input.nextInt();
        System.out.print("b=a³-a² şartını sağlayan a değeri: ");
        for (int a = 1; a < 100; a++) {
            if (b==(a*a*a)-(a*a)) {
                System.out.println(+a);
            }
        }
    }
    
}
