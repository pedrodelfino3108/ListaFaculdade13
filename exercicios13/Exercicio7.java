package exercicios13;

public class Exercicio7 {
	public static boolean isPalindromo(String texto) {
		texto = texto.toLowerCase().replaceAll("[\\s]", "");
		int esquerda = 0;
		int direita = texto.length() - 1;
		while (esquerda < direita) {
			if (texto.charAt(esquerda) != texto.charAt(direita)) {
				return false;
			}
			esquerda++;
			direita--;
		}
		return true;
	}

	public static void main(String[] args) {
		String texto = "A man a plan a canal Panama";
		boolean resultado = isPalindromo(texto);
		System.out.println("A string \"" + texto + "\" é um palíndromo? " + resultado);
	}
}
