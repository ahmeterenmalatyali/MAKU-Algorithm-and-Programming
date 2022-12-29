/*
Klavyeden girilen cümleye göre kaç tane kelime plduğunu bulan program
 */
import java.util.Scanner;
public class week11_example8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen küçük harflerle bir ifade giriniz: ");
        String txt = input.nextLine();
        char[] nokt= {',','.',';',':',' ','!','?'};
        int sayac=0;
        for (int i = 0; i < txt.length(); i++) {
            char h=txt.charAt(i);
            for (int j = 0; j < nokt.length; j++) {
                if (h==nokt[j]) {
                    sayac++;
                }
            }
        }
        System.out.println(+sayac+" tane kelime vardır ");
    }
    
}
