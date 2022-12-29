/*
->Klavyeden girilen rastgele büyüklükte ifadenin harflerini büyükse küçük , küçükse büyük yazma
 */
package homeworks;
import java.util.Scanner;
public class week11_homework2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen rastgele büyüklükte bir ifade girin: ");
        String txt=input.nextLine();
        for (int i = 0; i < txt.length(); i++) {
            char h = txt.charAt(i);
            if (Character.isUpperCase(h)) {
                System.out.print(Character.toLowerCase(txt.charAt(i))+"");
            }
            else{
                System.out.print(Character.toUpperCase(txt.charAt(i))+"");
            }
        }
    }
    
}
