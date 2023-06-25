
public class Ej_Fizz_Buzz {

    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz ");
            } else if (i % 3 == 0) {
                System.out.print("fizz ");
            } else if (i % 5 == 0) {
                System.out.print("buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
