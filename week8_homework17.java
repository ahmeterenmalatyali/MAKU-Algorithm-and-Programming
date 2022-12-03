/*
->Klavyeden girilen doğru parçasını gümüş oranda bölen program
Gümüş oran => (2a+b)/a=a/b   a=u/√2   b=u-a (u=toplam uzunluk)
Adım 1:Başlat 
Adım 2:Klavyeden doğru parçasının uzunluğunu(u) al
Adım 3:a=u/√2
Adım 4:b=u-a
Adım 5:Yaz a , b
Adım 6:Bitir
 */
package homeworks;
import java.lang.Math;
import java.util.Scanner;
public class week8_homework17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double u;
        do {
            System.out.print("Lütfen doğru parçasının uzunluğunu giriniz: ");
            u=input.nextDouble();                    
        } while (u<=0);
        double x=Math.sqrt(2);
        double a=u/x;
        double b=u-a;
        System.out.println("Doğru parçası "+a+" , "+b +" oranında kesilir.");
    }
    
}
