package exerciciosLista2;
import java.util.Scanner;
public class Ex10 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita o número inteiro
	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();

	        // Trabalha com valor absoluto para lidar com números negativos
	        int num = Math.abs(numero);
	        int soma = 0;

	        // Loop para somar os dígitos
	        while (num > 0) {
	            soma += num % 10; // pega o último dígito
	            num /= 10;        // remove o último dígito
	        }

	        // Exibe o resultado
	        System.out.println("A soma dos dígitos de " + numero + " é: " + soma);

	        scanner.close();
	    }
}
