/*
Klavyeden girilen bir cümleyi tersten yazdırma
 */
import java.util.Scanner;
public class week11_example3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz");
        String txt = input.nextLine();
        for (int i = txt.length()-1; i >= 0; i--) {
            System.out.print(txt.charAt(i)+"");
        }
        System.out.println();
    }
    
}
