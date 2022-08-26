import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) throws Exception {
 
        Scanner scanner = new Scanner(System.in);

        int idade = 0;
        double media;
        int cont = 0;
        int soma = 0;

        System.out.println("Digite as idades: ");

        while(idade >= 0){
            
            idade = scanner.nextInt();
            if (idade >= 0){
            soma = soma + idade;
            cont++;}

        }

        media = (double)soma/cont;
        if (media > 0){
        System.out.printf("A media é de: %.2f ", media);
        } else{
            System.out.println("IMPOSSIVEL CALCULAR");
        }


        scanner.close();

    }
}
