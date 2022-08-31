import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int num, den;
        double div;

        System.out.print("Quantos casos vai digitar? ");
        n = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("Entre com o numerador: ");
            num = scanner.nextInt();
            System.out.print("Entre com o denominador: ");
            den = scanner.nextInt();

            div = (double) num / den;

            if (den == 0) {
                System.out.println("Divisão IMPOSSIVEL");
            } else {
                System.out.printf("Divisão: %.2f", div);
            }
            System.out.println();
        }
        scanner.close();
    }
}
