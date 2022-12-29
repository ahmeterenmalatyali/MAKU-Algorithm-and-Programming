/*
Bilgisayarla taş kağıt makas oyunu
 */
package homeworks;
import java.util.Scanner;
import java.util.Random;
public class week11_homework8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random r=new Random();
        int pc = r.nextInt(3);
        int you;
        do {
            System.out.println("Lütfen taş kağıt makası seçiniz(0:taş,1:kağıt,2:makas): ");
            you =input.nextInt();
        } while (you>2 || you<0);
        if ((you==0 && pc==2) || (you==1 && pc==0)) {
            System.out.println("Kazandınız");
        }
        else if ((pc==0 && you==2) || (pc==1 && you==0)) {
            System.out.println("Yenildiniz");
        }
        else{
            System.out.println("Berabere");
        }
        System.out.println(pc);
    }
    
}
