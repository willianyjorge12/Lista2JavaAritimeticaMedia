package exerciciosLista2;
import java.util.Scanner;
public class Ex06 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita os três números
	        System.out.print("Digite o primeiro número: ");
	        double n1 = scanner.nextDouble();

	        System.out.print("Digite o segundo número: ");
	        double n2 = scanner.nextDouble();

	        System.out.print("Digite o terceiro número: ");
	        double n3 = scanner.nextDouble();

	        // Verifica se algum número é negativo, pois a média geométrica para números negativos não é definida no conjunto dos números reais
	        if (n1 < 0 || n2 < 0 || n3 < 0) {
	            System.out.println("Erro: os números devem ser não negativos para calcular a média geométrica.");
	        } else {
	            // Calcula a média geométrica
	            double mediaGeometrica = Math.cbrt(n1 * n2 * n3);

	            // Exibe o resultado
	            System.out.printf("A média geométrica é: %.2f\n", mediaGeometrica);
	        }

	        scanner.close();
	    }
}
