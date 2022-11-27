/*
metreyi kilometreye dönüştürme
*/
import java.util.Scanner; // javanın util kütüphanesine ait Scanner sınıfı
public class week2_example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lütfen hesaplanmasını istediğiniz km giriniz");
        int km = input.nextInt(); // Kullanıcıdan km aldık
        int m = km * 1000; // km'dem m'ye dönüşüm yaptık
        System.out.println("Hesaplanan metre:"+m);
    }
    
}
