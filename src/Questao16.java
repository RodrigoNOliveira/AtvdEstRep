import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, qtd, coelho = 0, sapo = 0, rato = 0, result = 0;

        System.out.print("Quantos casos de testes serão digitados: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.print("Quantidade de cobaias: ");
            qtd = scanner.nextInt();
            result = result + qtd;
            System.out.print("Tipo de cobaia: ");
            char cobaia = scanner.next().toUpperCase().charAt(0);
            switch (cobaia) {
                case 'C':
                    coelho += qtd;
                    break;
                case 'S':
                    sapo += qtd;
                    break;
                case 'R':
                    rato += qtd;
                    break;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("RELATÓRIO FINAL:");
        System.out.println();
        System.out.println("Total de cobaias: " + result);
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.println();
        System.out.println();
        System.out.println("PERCENTUAIS DE COBAIAS");
        System.out.println();
        System.out.printf("Percentual de coelhos:  %.2f\n", ((double) coelho * 100 / result));
        System.out.printf("Percentual de ratos:  %.2f\n", ((double) rato * 100 / result));
        System.out.printf("Percentual de sapos:  %.2f\n", ((double) sapo * 100 / result));
        scanner.close();
    }
}
