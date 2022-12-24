package matematicas;

public class Calculadora {

	float valor1;
	float valor2;

	public Calculadora(float valorcito1, float valorcito2) {
		this.valor1 = valorcito1;
		this.valor2 = valorcito2;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float valor1 = 20;
		float valor2 = 5;
		System.out.println(
				"El resultado de la division de: " + valor1 + " entre " + valor2 + " es " + division(valor1, valor2));
		System.out.println(
				"El resultado de la multiplicacion de: " + valor1 + " por " + valor2 + " es " + multiplicacion(valor1, valor2));
	}

	public static float division(float valor1, float valor2) {
		float resultado = valor1 / valor2;
		return resultado;

	}

	public static float multiplicacion(float valor1, float valor2) {
		float resultado = valor1 * valor2;
		return resultado;

	}
}
