/* convertir un numero a decimal a binario,
despues convertir a su inverso binario y obtener su resultado en decimal,
pero,
en este programa los numeros binarios se emparejan a 8 cifras para valores menores a 8,
y se emparejan a 16 cifras para valores mayores a 8.
Ej: 4567 = 1000111010111, 
emparejandolo: 0001000111010111,
inverso binario: 1110101110001000,
decimal equivalente: 60296
 */
import java.util.Scanner;

public class ReverseBinary {

    public static String BinaryReversal(String str) {

        long in = Long.parseLong(str);
        long exp, dig, dec;
        int width = 8;
        int width2 = 16;
        String formato = "";
        String inv = "";
        String binario = Long.toBinaryString(in);

        if (binario.length() <= 8) {
            formato = String.format("%0" + width + "d", Long.valueOf(binario));
        } else if (binario.length() > 8) {
            formato = String.format("%0" + width2 + "d", Long.valueOf(binario));
        }

        for (int indice = formato.length() - 1; indice >= 0; indice--) {
            inv += formato.charAt(indice);
        }

        long bin = Long.parseLong(inv);

        dec = 0;
        exp = 0;

        while (bin != 0) {
            dig = bin % 10;
            dec = dec + dig * (long) Math.pow(2, exp);
            exp++;
            bin = bin / 10;
        }

        String resultado = Long.toString(dec);

        return resultado;
    }

    public static void main(String args[]) {
        // TODO code application logic here
        System.out.print("Introduce un numero para convertirlo en su reverso binario: ");
        Scanner s = new Scanner(System.in);
        System.out.print(BinaryReversal(s.nextLine()));
    }
}
