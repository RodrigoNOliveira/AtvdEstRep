import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = 1, y = 1;
        String quadrante = "";

        while (x != 0 && y != 0) {
            System.out.print("Digite o valor de x: ");
            x = scanner.nextDouble();
            System.out.print("Digite o valor de y: ");
            y = scanner.nextDouble();
            if (x > 0 && y > 0) {
                quadrante = "Q1";
            } else if (x > 0 && y < 0) {
                quadrante = "Q4";
            } else if (x < 0 && y < 0) {
                quadrante = "Q3";
            } else if (x < 0 && y > 0) {
                quadrante = "Q2";
            }
            if (quadrante != "") {
                System.out.println("O quadrante a eles pertencido: " + quadrante);
            }
            quadrante = "";
        }
        scanner.close();
    }
}
