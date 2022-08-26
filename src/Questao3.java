import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) throws Exception {
 
        Scanner scanner = new Scanner(System.in);

        int senha, senha2 = 0;
    

        System.out.println("Digite a senha: ");
        senha = scanner.nextInt();
        System.out.println("Insira novamente: ");
        while(senha != senha2){
            
            senha2 = scanner.nextInt();
            if (senha2 == senha){
                System.out.println("Acesso permitido!");
        }   
            else {
                System.out.print("Senha inválida! Tente novamente: " );
            }

        }

        scanner.close();

    }
}
