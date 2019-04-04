package objetos;

/**
 * Crea una clase TestCirculo que cree una instancia de �Circulo�, muestre su
 * estado, lo haga crecer 27 veces, averig�e su �rea, lo haga decrecer 10 veces
 * y muestre su estado final.
 * 
 * Modifica la clase C�rculo para que cuando el radio se convierta a 0 el
 * c�rculo reaccione y diga con una caja de texto gr�fica �Soy un m�sero punto
 * sin �rea� usando la clase JOptionPane del paquete javax.swing. Pod�is ver
 * este v�deo: https://youtu.be/F_48qh3BcDs
 * 
 * @author ariza
 *
 */

public class TestCirculo {

	public static void main(String[] args) {
		Circulo miCirculo = new Circulo(-5);

		// Muestra su estado
		System.out.println(miCirculo);

		// Lo hace crecer 27 veces
		miCirculo.crece(27);

		// Averigua su �rea
		System.out.println(miCirculo.calculaArea());

		// Lo hace decrecer 10 veces
			miCirculo.mengua(10);
		

		// Muestra su estado final
		System.out.println(miCirculo.toString());

	}

}
