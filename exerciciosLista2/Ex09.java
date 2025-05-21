package exerciciosLista2;
import java.util.Scanner;
public class Ex09 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a base
        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();

        // Solicita o expoente
        System.out.print("Digite o expoente: ");
        double expoente = scanner.nextDouble();

        // Calcula a potência
        double resultado = Math.pow(base, expoente);

        // Exibe o resultado
        System.out.printf("%.2f elevado a %.2f é: %.2f\n", base, expoente, resultado);

        scanner.close();
    }
}
