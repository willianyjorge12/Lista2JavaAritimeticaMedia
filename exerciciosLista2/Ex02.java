package exerciciosLista2;
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		 
		        Scanner scanner = new Scanner(System.in);

		        // Solicita os dados do usuário
		        System.out.print("Digite o capital inicial (em reais): ");
		        double capital = scanner.nextDouble();

		        System.out.print("Digite a taxa de juros anual (em %): ");
		        double taxaJuros = scanner.nextDouble();

		        System.out.print("Digite o número de anos: ");
		        int anos = scanner.nextInt();

		        // Calcula o montante com juros compostos
		        double montante = capital * Math.pow((1 + taxaJuros / 100), anos);

		        // Exibe o resultado
		        System.out.printf("O montante final após %d anos será: R$ %.2f\n", anos, montante);

		        // Fecha o scanner
		        scanner.close();

	}

}
