import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, d = 0, f =0;

        System.out.print("Quantos numeros vai digitar? ");
        n = scanner.nextInt();
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            int num = scanner.nextInt();
            if (num > 9 && num <21){
                d++;
            }
            else{
                f++;
            }
        }

        System.out.println(d + " DENTRO");
        System.out.println(f + " FORA");
        scanner.close();
    }
}
