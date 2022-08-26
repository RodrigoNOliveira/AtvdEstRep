import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, n2, result = 0, maior = 0, menor = 0, cont;

        System.out.println("Digite dois numeros: ");
        n = scanner.nextInt();
        n2 = scanner.nextInt();
        scanner.close();

        if (n > n2){
            maior = n;
            menor = n2;
        }
        else if (n < n2){
            maior = n2;
            menor = n;
        }

        cont =((menor - maior)*-1)/2;


        System.out.println("Soma dos impares: " + result);
    }
}
