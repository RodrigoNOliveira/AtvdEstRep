import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int prim= 0, seg = 1;
        while(prim != seg){
            System.out.println("Digite dois numeros: ");
            prim = scanner.nextInt();
            seg = scanner.nextInt();

            if (prim > seg){
                System.out.println("Decrescente");
            } else if (prim < seg){
                System.out.println("Crescente");
            }

        }
        scanner.close();
    }
}
