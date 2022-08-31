import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        double v1, v2, v3, media;

        System.out.print("Quantos casos vai digitar? ");
        n = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite três números: ");
            v1 = scanner.nextDouble() * 2;
            v2 = scanner.nextDouble() * 3;
            v3 = scanner.nextDouble() * 5;
            int peso = 2+3+5;
            media = (v1+v2+v3)/peso;
            System.out.printf("MÉDIA: %.1f" , media);
            System.out.println();
        }
        scanner.close();
    }
}
