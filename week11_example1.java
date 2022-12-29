import java.util.Scanner;
public class week11_example1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz");
        String txt = input.nextLine();//Kelime alır
        System.out.println("Lütfen ikinci ifadeyi giriniz");
        String txt2 =input.nextLine();
        char ch= 'A';//Karakter tanımlama
        char ch2= 'a';
        System.out.println("A: "+(int)ch+" , a: "+(int)ch2); //başına int yazarsak kelimenin sayı karşılığını alır
        
        for (int i = 0; i < txt.length(); i++) {//txt.length()  -> uzunluğu verir
            System.out.println((i+1)+". harf: " +txt.charAt(i));//kelimeyi harf dizisi olarak düşün
        }
        
        if(txt.equals("eren")){//txt eren ise
            System.out.println("Evet");
        }
        else{
            System.out.println("Hayır");
        }
    }
    
}
