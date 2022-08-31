import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.print("Quantos numeros vai digitar? ");
        num = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < num; i++) {
            System.out.print("Digite um numero: ");
            int n = scanner.nextInt();
            if (n % 2 != 0 && n > 0) {
                System.out.println("ÍMPAR POSITIVO");
            } else if (n % 2 != 0 && n < 0) {
                System.out.println("ÍMPAR NEGATIVO");
            } else if (n % 2 == 0 && n < 0) {
                System.out.println("PAR NEGATIVO");
            } else if (n % 2 == 0 && n > 0) {
                System.out.println("PAR POSITIVO");
            } else {
                System.out.println("NULO");
            }
        }
        scanner.close();
    }
}
