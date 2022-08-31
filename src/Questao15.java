import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n,result = 1;

        System.out.print("Digite o valor de N: ");
        n = scanner.nextInt();

            if (n >15){
                System.out.println("Acima do valor maximo");
            }
            else{
            for (int i = n; i > 0; i--) {
                result = result * i;
                
            }
        }

        System.out.println("Fatorial: " + result);
        scanner.close();
    }
}
