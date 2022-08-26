import java.util.Scanner;

public class Questao7 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int x=1;
    int soma = 0;
    while (x!=0){
        soma = 0;
        System.out.print("Digite um numero inteiro: ");
        x = scanner.nextInt();

        if (x!=0){
            if (x % 2 == 0){

                for (int i = 0; i < 5; i++) {
                    soma = soma + x + 2*i;
                }
            } 
            
            else {
                x = x +1;

                for (int i = 0; i < 5; i++) {
                    soma = soma + x + 2*i;
                }
            }
            System.out.println("Soma = " + soma);
        }
    }

    
    scanner.close();
   }
    
}
