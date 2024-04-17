package exercicios13;

public class Exercicio5 {

	public static boolean isAnoBissexto(int ano) {
		return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
	}

	public static void main(String[] args) {
		int ano = 2024;
		boolean resultado = isAnoBissexto(ano);
		System.out.println("O ano " + ano + " é bissexto? " + resultado);
	}
}
