/*
->Klavyeden girilen metinden girilen harfin nerede ve kaç tane olduğunu bulan program
 */
import java.util.Scanner;
public class week11_example2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz: ");
        String txt = input.nextLine();
        System.out.println("Lütfen bir harf giriniz: ");
        char ch = input.nextLine().charAt(0);//Bir harf alma
        int sayac=0;
        for (int i = 0; i < txt.length(); i++) {
            if (ch == txt.charAt(i)) {
                sayac=sayac+1;
                System.out.print((i+1)+" , ");
            }
        }
        System.out.println("\n"+sayac +" tane "+ch+" var");//  \n alt satıra geçirir  
        
    }
    
}
