/*
->Klavyeden girilen pozitif tamsayıya göre pisagor üçlemesini bulan program
Pisagor üçlemesi=a²+b²=c² , a+b+c=n
Adım 1:Başlat
Adım 2:Klavyeden pozitif tamsayı(n) al
Adım 3:a=1
Adım 4:Eğer a>n-1 ise git adım 13
Adım 5:b=a+1
Adım 6:Eğer b>n-a ise git adım 11
Adım 7:c=n-a-b
Adım 8:Eğer a*a+b*b=c*c ise yaz a , b , c
Adım 9:b=b+1
Adım 10:Git adım 6
Adım 11:a=a+1
Adım 12:Git adım 4
Adım 13:Bitir
 */
package homeworks;
import java.util.Scanner;
public class week8_homework52 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen pozitif bir tamsayı giriniz: ");
            n=input.nextInt();
        } while (n<=0);
        for (int a = 1; a <= n-1; a++) {
            for (int b = a+1; b <= n-a; b++) {
                int c=n-a-b;
                if (a*a+b*b==c*c) {
                    System.out.print("("+a+","+b+","+c+")");
                }
            }
        }
    }
    
}
