package matematicas;

public class calculadora {
	// atributos
	float valor1;
	float valor2;

	public calculadora(float valorcito1, float valorcito2) {
		this.valor1 = valorcito1;
		this.valor2 = valorcito2;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float valor1 = 5.5F;
		float valor2 = 10.0F;
		System.out.println("El resultado de la multiplicacion de los valores  "
		+ valor1 + " y "
	    + valor2 + "   es: "
		+ multiplicacion(valor1, valor2));
		System.out.println ("El resultado de la suma de los valores  "
				+ valor1 + " y "
			    + valor2 + "   es: "
				+ suma(valor1, valor2));
		System.out.println ("El resultado de la division de los valores  "
				+ valor1 + " y "
			    + valor2 + "   es: "
				+ division(valor1, valor2));
		System.out.println ("El resultado de la resta de los valores  "
				+ valor1 + " y "
			    + valor2 + "   es: "
				+ resta(valor1, valor2));
	}

	public static float multiplicacion(float valor1, float valor2) {
	    return valor1 * valor2;
		
	}
	public static float suma(float valor1, float valor2) {
	    return valor1 + valor2;
		
	}
	public static float division(float valor1, float valor2) {
	    return valor1 / valor2;
		
	}
	public static float resta(float valor1, float valor2) {
	    return valor1 - valor2;
		
	}
	
}
