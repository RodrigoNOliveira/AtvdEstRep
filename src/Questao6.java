import java.util.Scanner;

public class Questao6 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcao = 0;
    int gasolina = 0, alcool = 0, diesel = 0;

    
    while (opcao!=4){
    System.out.print("Informe um codigo(1,2,3) ou 4 para parar: ");
        opcao = scanner.nextInt();
        switch (opcao){
            case 1: 
                alcool++;
            break;
            case 2:    
                gasolina ++;
            break;
            case 3: 
                diesel++;
            break;
            case 4:
                System.out.println("Muito obrigado");
            break; 
        }
    }
     System.out.println("Alcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel);
    scanner.close();
   }
}
