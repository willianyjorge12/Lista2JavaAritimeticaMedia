package exerciciosLista2;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os três números
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double n3 = scanner.nextDouble();

        // Verifica se algum número é zero para evitar divisão por zero
        if (n1 == 0 || n2 == 0 || n3 == 0) {
            System.out.println("Erro: nenhum número pode ser zero para calcular a média harmônica.");
        } else {
            // Calcula a média harmônica
            double mediaHarmonica = 3 / ((1/n1) + (1/n2) + (1/n3));

            // Exibe o resultado
            System.out.printf("A média harmônica é: %.2f\n", mediaHarmonica);
        }

        scanner.close();
    }
}
