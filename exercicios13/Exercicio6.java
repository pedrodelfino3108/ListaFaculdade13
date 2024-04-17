package exercicios13;

public class Exercicio6 {

	public static int maximo(int num1, int num2) {
		return (num1 > num2) ? num1 : num2;
	}

	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 20;
		int resultado = maximo(num1, num2);
		System.out.println("O máximo entre " + num1 + " e " + num2 + " é " + resultado);
	}
}
