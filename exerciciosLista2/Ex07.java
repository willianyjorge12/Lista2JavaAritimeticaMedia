package exerciciosLista2;
import java.util.Scanner;
public class Ex07 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita os coeficientes
	        System.out.print("Digite o valor de a (diferente de zero): ");
	        double a = scanner.nextDouble();

	        if (a == 0) {
	            System.out.println("O valor de 'a' deve ser diferente de zero para ser uma equação quadrática.");
	        } else {
	            System.out.print("Digite o valor de b: ");
	            double b = scanner.nextDouble();

	            System.out.print("Digite o valor de c: ");
	            double c = scanner.nextDouble();

	            // Calcula o discriminante
	            double delta = b * b - 4 * a * c;

	            if (delta > 0) {
	                // Duas raízes reais e distintas
	                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
	                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
	                System.out.printf("Duas raízes reais: %.2f e %.2f\n", raiz1, raiz2);
	            } else if (delta == 0) {
	                // Uma raiz real (raiz dupla)
	                double raiz = -b / (2 * a);
	                System.out.printf("Raiz real dupla: %.2f\n", raiz);
	            } else {
	                // Raízes complexas
	                double parteReal = -b / (2 * a);
	                double parteImaginaria = Math.sqrt(-delta) / (2 * a);
	                System.out.printf("Raízes complexas:\n");
	                System.out.printf("%.2f + %.2fi\n", parteReal, parteImaginaria);
	                System.out.printf("%.2f - %.2fi\n", parteReal, parteImaginaria);
	            }
	        }

	        scanner.close();
	    }
}
