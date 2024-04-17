package exercicios13;

public class Exercicio10 {
	public static double calcularAreaRetangulo(double base, double altura) {
		return base * altura;
	}

	public static void main(String[] args) {
		double base = 5.0;
		double altura = 10.0;
		double area = calcularAreaRetangulo(base, altura);
		System.out.println("A área do retângulo com base " + base + " e altura " + altura + " é " + area);
	}
}
