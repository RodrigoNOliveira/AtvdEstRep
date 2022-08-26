import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double nota1 = -1;
        double media = 0;
        double nota2 = -1;

        System.out.println("Digite a primeira nota: ");
        while (nota1 < 0 || nota1 > 10) {
            nota1 = scanner.nextDouble();
            if( nota1 < 0 || nota1 >10){
                System.out.print("Valor invalido! Tente novamente: ");
            }
            else {
                media = media + nota1;         
                }
        }

        System.out.println("Digite a segunda nota: ");
        while (nota2 < 0 || nota2 > 10) {
            nota2 = scanner.nextDouble();
            if( nota2 < 0 || nota2 >10){
                System.out.print("Valor invalido! Tente novamente: ");
            }
            else {
                media = media + nota2;    
                }
        }

        media = media / 2;
        if (media > 0) {
            System.out.printf("A media é de: %.2f ", media);
        }

        scanner.close();

    }
}
