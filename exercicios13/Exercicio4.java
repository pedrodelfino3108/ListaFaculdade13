package exercicios13;

public class Exercicio4 {

	public static double calcularMedia(int num1, int num2, int num3) {
		return (num1 + num2 + num3) / 3.0;
	}

	public static void main(String[] args) {
		int num1 = 5, num2 = 10, num3 = 15;
		double resultado = calcularMedia(num1, num2, num3);
		System.out.println("A média de " + num1 + ", " + num2 + ", e " + num3 + " é " + resultado);
	}
}
