/*
->Klavyeden küçük harflerle girilen bir kelimenin harflerini 2 büyük 2 küçük yaparak tekrar yazdıran program 
 */
package homeworks;
import java.util.Scanner;
public class week11_homework3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen küçük harflerle bir ifade girin: ");
        String txt =input.nextLine();
        for (int i = 0; i < txt.length(); i++) {
            if (i==txt.length()) {
                break;
            }
            for (int j = 0; j < 2; j++) {
                System.out.print(Character.toUpperCase(txt.charAt(i))+"");
                i++;
                if (i==txt.length()) {
                    break;
                }
            }
            if (i==txt.length()) {
                break;
            }        
            for (int j = 0; j < 2; j++) {
                
                System.out.print(Character.toLowerCase(txt.charAt(i))+"");
                i++;
                if (i==txt.length()) {
                    break;
                }
            }
        }
    }
    
}
