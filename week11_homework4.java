/*
->Klavyeden küçük harflerle girilen bir kelimenin sırasıyla sesli harflerinden k1 ve sessiz harflerinden k2 kelimesini oluşturup ekrana yazdıran program
 */
package homeworks;
import java.util.Scanner;
public class week11_homework4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen küçük harflerle bir kelime giriniz: ");
        String txt=input.nextLine();
        String sesli="aeiou";
        String sessiz="qwrtypsdfghjklzxcvbnm";
        System.out.print("k1=");
        for (int i = 0; i < txt.length(); i++) {
            char h1=sesli.charAt(i);
            for (int j = 0; j < sesli.length(); j++) {
                if (txt.equals(h1)) {
                    System.out.print(h1);
                }
            }
        }
        System.out.println("\n"+"k2=");
         for (int i = 0; i < txt.length(); i++) {
            char h2=sessiz.charAt(i);
            for (int j = 0; j < sessiz.length(); j++) {
                if (txt.equals(h2)) {
                    System.out.print(h2);
                }
            }
        }
    }
    
}
