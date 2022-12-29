/*
Klavyeden büyük harflerle girilen kelimenin harflerini alfabedeki sıraları kadar * karakterini ayrı ayrı satırlara yazdıran program
 */
package homeworks;
import java.util.Scanner;
public class week11_homework6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen büyük harflerle bir kelime giriniz: ");
        String txt =input.nextLine();
        for (int i = 0; i < txt.length(); i++) {
            char x=txt.charAt(i);
            for (int j = 0; j < (int)x-64; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
}
