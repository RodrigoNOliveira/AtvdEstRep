import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, result;

        System.out.print("Deseja a tabuada para qual valor? ");
        n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            result = n*i;
            System.out.println( n + " x " + i + " = " + result);
        }

        scanner.close();

    }
}
