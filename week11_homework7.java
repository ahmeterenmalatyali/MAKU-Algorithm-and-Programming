/*
->Klavyeden girilen kelimeyi ortadan bölerek herbir parçasını tersten yazdıran program
 */
package homeworks;
import java.util.Scanner;
public class week11_homework7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz: ");
        String txt=input.nextLine();
        System.out.print("1.Parça: ");
        for (int i = 0; i < txt.length()/2; i++) {
            System.out.print(txt.charAt(txt.length()/2-1-i));
        }
        System.out.println();
        System.out.print("2.Parça: ");
        int j=0;
        for (int i = txt.length()/2; i < txt.length(); i++) {            
            System.out.print(txt.charAt(txt.length()-1-j));
            j++;
        }
    }
    
}
