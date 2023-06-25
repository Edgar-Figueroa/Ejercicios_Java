
import java.util.Scanner;

public class Ej_OddEven {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = entrada.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " es par");
        } else {
            System.out.println(num + " es impar");
        }
    }
}
