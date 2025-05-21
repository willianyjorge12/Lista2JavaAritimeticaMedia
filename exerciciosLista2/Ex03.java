package exerciciosLista2;
import java.util.Scanner;
public class Ex03 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita o valor em reais
	        System.out.print("Digite o valor em reais (R$): ");
	        double valorReais = scanner.nextDouble();

	        // Solicita as taxas de câmbio
	        System.out.print("Digite a taxa de câmbio do dólar (quantos reais valem 1 dólar): ");
	        double taxaDolar = scanner.nextDouble();

	        System.out.print("Digite a taxa de câmbio do euro (quantos reais valem 1 euro): ");
	        double taxaEuro = scanner.nextDouble();

	        System.out.print("Digite a taxa de câmbio da libra (quantos reais valem 1 libra): ");
	        double taxaLibra = scanner.nextDouble();

	        // Converte os valores
	        double valorDolar = valorReais / taxaDolar;
	        double valorEuro = valorReais / taxaEuro;
	        double valorLibra = valorReais / taxaLibra;

	        // Exibe os resultados
	        System.out.printf("Valor em dólares: US$ %.2f\n", valorDolar);
	        System.out.printf("Valor em euros: € %.2f\n", valorEuro);
	        System.out.printf("Valor em libras: £ %.2f\n", valorLibra);

	        // Fecha o scanner
	        scanner.close();
}
}