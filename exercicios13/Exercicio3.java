package exercicios13;

public class Exercicio3 {
	public static String verificarNumero(int numero) {
		if (numero > 0) {
			return "Positivo";
		} else if (numero < 0) {
			return "Negativo";
		} else {
			return "Zero";
		}
	}

	public static void main(String[] args) {

		int numero = -5;
		String resultado = verificarNumero(numero);
		System.out.println("O número " + numero + " é " + resultado);
	}
}
