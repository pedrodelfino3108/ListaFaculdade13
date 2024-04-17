package exercicios13;

public class Exercicio2 {
	public static int calcularQuadrado(int numero) {
		return numero * numero;
	}

	public static void main(String[] args) {

		int numero = 7;
		int resultado = calcularQuadrado(numero);
		System.out.println("O quadrado de " + numero + " é " + resultado);
	}

}
