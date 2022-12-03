/*
->100-9999 arasındaki palindrom sayıları yazan program
Palindrom sayı:tersi gene kendine eşit olan sayılar
 */
package homeworks;
public class week8_homework38 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int N=i*100+j*10+i;
                System.out.print(+N+" , ");
            }
        }
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int N=i*1000+j*100+j*10+i;
                System.out.print(+N+" , ");
            }
        }
    }
    
}
