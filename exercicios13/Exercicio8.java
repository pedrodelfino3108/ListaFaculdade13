package exercicios13;

public class Exercicio8 {
	public static long calcularFatorial(int numero) {
		long fatorial = 1;
		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}
		return fatorial;
	}

	public static void main(String[] args) {
		int numero = 5;
		long resultado = calcularFatorial(numero);
		System.out.println("O fatorial de " + numero + " é " + resultado);
	}
}
