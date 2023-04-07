package EstruturaSequencial_Exercicio_7;
import java.util.Scanner;

public class SquareArea {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Insira o valor de um lado do quadrado para calcular o dobro da área");
		double areaInput = userInput.nextDouble();
		System.out.println("O dobro da área é:" + (areaInput*areaInput)*2);
		userInput.close();
	}
}