package exerciciosLista2;
import java.util.Scanner;
public class Ex04 {
	public static void main (String [] args) {
	  Scanner scanner = new Scanner(System.in);

      // Solicita a base e a altura
      System.out.print("Digite a base do triângulo: ");
      double base = scanner.nextDouble();

      System.out.print("Digite a altura do triângulo: ");
      double altura = scanner.nextDouble();

      // Calcula a área
      double area = (base * altura) / 2;

      // Assumindo um triângulo isósceles:
      // Calcula o comprimento dos lados iguais usando o Teorema de Pitágoras
      double ladoIgual = Math.sqrt(Math.pow((base / 2), 2) + Math.pow(altura, 2));

      // Calcula o perímetro
      double perimetro = base + 2 * ladoIgual;

      // Exibe os resultados
      System.out.printf("Área do triângulo: %.2f\n", area);
      System.out.printf("Perímetro do triângulo (assumido isósceles): %.2f\n", perimetro);

      scanner.close();
}
}