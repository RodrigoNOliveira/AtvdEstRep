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

        cont =((menor - maior +1)/2)*-1;
       
        if (cont !=0){
        if (menor%2!=0){
            for (int i = 1; i <= cont; i++) {
                result = result + menor + 2*i;
            }
        } else {
            menor = menor - 1;
            for (int i = 1; i <= cont; i++) {
                result = result + menor + 2*i;
            }
        }
    }


        System.out.println("Soma dos impares: " + result);

        scanner.close();
    }
}
