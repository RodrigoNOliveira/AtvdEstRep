import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("Digite um numero: ");
        n = scanner.nextInt();
        
  
        if (n%2!=0){
            for (int i = 1; i <= n; i++) {
                
                System.out.println(i);
                i++;
            }
        } else {
            
            for (int i = 1; i < n; i++) {
                System.out.println(i);
                i++;
            }
        }
        scanner.close();
    }
}
