/*
->Klavyeden girilen kelimeyi ortadan bölerek sırasıyla ikinci parçadan ileri ve birinci parçadan geri doğru birer karakter alarak yazdıran program
 */
package homeworks;
import java.util.Scanner;
public class week11_homework5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz: ");
        String txt =input.nextLine();
        for (int i = 0; i < txt.length()/2; i++) {
            System.out.print(txt.charAt(i));
            System.out.print(txt.charAt(txt.length()-1-i));
        }
        if (txt.length()%2==1) {
            System.out.println(txt.charAt(txt.length()/2));
        }
    }
    
}
