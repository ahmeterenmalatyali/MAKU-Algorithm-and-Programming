/*
->Klavyeden küçük harflerle girilen bir cümlenin harflerini rastgele büyüklükte yazdıran program 
 */
package homeworks;
import java.util.Scanner;
import java.util.Random;
public class week11_homework1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen küçük harflerle bir ifade giriniz:");
        String txt =input.nextLine();
        Random r=new Random();
        for (int i = 0; i < txt.length(); i++) {
            int R=r.nextInt(2);
            if (R==0) {
                System.out.println(Character.toLowerCase(txt.charAt(i))+"");
            }
            else if (R==1){
                System.out.println(Character.toUpperCase(txt.charAt(i))+"");
            }
        }
    }
    
}
