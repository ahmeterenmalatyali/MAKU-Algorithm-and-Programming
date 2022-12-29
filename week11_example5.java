/*
Klavyeden küçük harflerle girilen cümledeki sesli harflerin sayısı ve yerini yazan program
 */
import  java.util.Scanner;
public class week11_example5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen küçük harflerle bir ifade giriniz: ");
        String txt = input.nextLine();
        String sesli="aeiuo";
        int sayac =0;
        for (int i = 0; i < txt.length(); i++) {
            for (int j = 0; j < sesli.length(); j++) {
                if (txt.charAt(i)==sesli.charAt(j)) {
                    System.out.println((i+1)+". karakterde ");
                    sayac+=1;
                }
            }
            
        }
        System.out.println(+sayac+" tane sesli harf vardır.");
    }
    
}
