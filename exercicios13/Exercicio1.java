package exercicios13;

public class Exercicio1 {

	public static boolean isPar(int numero) {
		return numero % 2 == 0;
	}

	public static void main(String[] args) {

		int numero = 4;
		boolean resultado = isPar(numero);
		System.out.println("O número " + numero + " é par? " + resultado);
	}

}
