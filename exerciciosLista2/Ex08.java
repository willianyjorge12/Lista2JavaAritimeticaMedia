package exerciciosLista2;
import java.util.Scanner;
public class Ex08 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Pede a quantidade de números
	        System.out.print("Quantos números você quer inserir? ");
	        int quantidade = scanner.nextInt();

	        // Verifica se a quantidade é válida
	        if (quantidade <= 0) {
	            System.out.println("Quantidade inválida. Por favor, insira um número positivo.");
	        } else {
	            double soma = 0;

	            // Lê os números e soma
	            for (int i = 1; i <= quantidade; i++) {
	                System.out.print("Digite o número " + i + ": ");
	                double num = scanner.nextDouble();
	                soma += num;
	            }

	            // Calcula e mostra a média
	            double media = soma / quantidade;
	            System.out.printf("A média dos números digitados é: %.2f\n", media);
	        }

	        scanner.close();
	    }
}
