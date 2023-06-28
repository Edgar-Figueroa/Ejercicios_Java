
import java.util.Scanner;

public class Palindromo {

    public static void main(String args[]) {
        // TODO code application logic here
        int resto, numeroInvertido = 0, normal;

        Scanner numero = new Scanner(System.in);
        System.out.println("¿Es palindromo?: ");
        int n = numero.nextInt();//numero para checar 

        normal = n;
        while (n > 0) {
            resto = n % 10;
            n = n / 10;
            numeroInvertido = (numeroInvertido * 10) + resto;
        }
        if (normal == numeroInvertido) {
            System.out.println("si es palindromo");
        } else {
            System.out.println("no es");
        }
    }
}
