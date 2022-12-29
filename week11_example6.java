/*
Klavyeden girilen kelimenin kaçıncı harf olduğuyla beraber yazma
 */
import java.util.Scanner;
public class week11_example6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz: ");
        String txt = input.nextLine();
        for (int i = 0; i < txt.length(); i++) {  
            System.out.print(txt.charAt(i)+""+(i+1));
        }
    }
    
}
