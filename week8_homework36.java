/*
->1 den 50 ye kadar markov sayılarını listeleyen program
*/
package homeworks;
public class week8_homework36 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            for (int j = i; j <= 50; j++) {
                for (int k = j; k <= 50; k++) {
                    if (i*i+j*j+k*k==(3*i*j*k)) {
                        System.out.println("("+i+","+j+","+k+")");
                    }
                }
            }
        }
    }
    
}