package objetos;

/**
 * Crea una clase Fraccion (en Java yPython) de forma que podamos hacer las
 * siguientes operaciones:
 * 
 * Contruir un objeto Fraccion pas�ndole al constructor el numerador y el
 * denominador. Obtener la fracci�n. Obtener y modificar numerador y
 * denominador. No se puede dividir por cero. Obtener resultado de la fracci�n
 * (n�mero real). Multiplicar la fracci�n por un n�mero. Multiplicar, sumar y
 * restar fracciones. Simplificar la fracci�n.
 * 
 * @author ariza
 *
 */

public class Fraccion {

	// atributos
	int numerador;
	int denominador;

	// constructor
	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		// No se puede dividir por cero.
		if (denominador == 0) {
			System.out.println("El denominador no puede ser 0");
		} else {
			this.denominador = denominador;
		}
	}

	// getters y setters
	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	// toString
	public String toString() {
		return this.numerador + "/" + this.denominador;
	}

	// Obtener y modificar numerador y denominador
	public void modificarFraccion(int numerador, int denominador) {
		this.numerador = numerador;
		// No se puede dividir por cero.
		if (denominador == 0) {
			System.out.println("El denominador no puede ser 0");
		} else {
			this.denominador = denominador;
		}
	}

	// Obtener resultado de la fracci�n (n�mero real).
	public double obtenerResultado() {
		double resultado;
		resultado = (double) numerador / denominador;
		return resultado;
	}

	// Multiplicar la fracci�n por un n�mero.
	public void multiplicarporNumero(int numero) {
		numerador = numero * numerador;
	}

	// Multiplicar, sumar y restar fracciones.
	public void multiplicarporFraccion(int a, int b) {
		numerador = numerador * a;
		denominador = denominador * b;
	}

	public void sumarporFraccion(int a, int b) {
		this.numerador = (this.numerador * b + this.denominador * a);
		this.denominador = this.denominador * b;
	}

	public void restarporFraccion(int a, int b) {
		this.numerador = (this.numerador * b - this.denominador * a);
		this.denominador = this.denominador * b;
	}

	// Simplificar la fracci�n.
	public int maximoComunDivisor() {
		int dividendo = this.numerador;
		int divisor = this.denominador;
		while (dividendo % divisor != 0) {
			int resto = dividendo % divisor;
			dividendo = divisor;
			divisor = resto;
		}
		return divisor;
	}

	public void simplificar() {
		int dividir = maximoComunDivisor();
		numerador /= dividir;
		denominador /= dividir;
	}

}
