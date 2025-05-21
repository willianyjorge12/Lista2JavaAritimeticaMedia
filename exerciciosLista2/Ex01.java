package exerciciosLista2;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite o peso da primeira nota: ");
        double peso1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite o peso da segunda nota: ");
        double peso2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        System.out.print("Digite o peso da terceira nota: ");
        double peso3 = sc.nextDouble();

        // Calcula a média ponderada
        double somaPesos = peso1 + peso2 + peso3;
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / somaPesos;

        // Exibe o resultado
        System.out.println("A média ponderada é: " + mediaPonderada);

        // Fecha o scanner
        sc.close();

	}

}
