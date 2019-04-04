package objetos;

import javax.swing.JOptionPane;

/**
 * Crea la clase �Circulo� en Java que responda al siguiente comportamiento:
 * 
 * Un c�rculo puede crecer. Aumenta su radio. 
 * Un c�rculo puede menguar. Decrementa su radio. 
 * Un c�rculo me devuelve su �rea si se la pido. 
 * Un c�rculo me dice su estado, por ejemplo �Soy un c�rculo de radio 0.5 metros. Ocupo un �rea de 
 * 0.7853981633974483 metros cuadrados� (m�todo toString()).
 * 
 * @author ariza
 *
 */

public class Circulo {

	// atributo
	private double radio;

	// constructor
	Circulo(int n){
		if(n<0) {
			this.radio=0;
		}else {
			this.radio = n;
		}
	}
	
	//Incrementa el radio sumandole n
	void crece(int n) {
		this.radio = radio+n;
	}
	
	//Mengua el radio rest�ndole n
	void mengua(int n) {
		double radioMenguado = 0;
		radioMenguado = this.radio;
		radioMenguado-=n;
		if(radioMenguado>0) {
			this.radio = radio-n;
		}else {
		System.out.println("El radio no puede ser negativo");
			
		}
	}
	
	
	//Devuelve �rea
	double calculaArea() {
		return Math.PI*(radio*radio);
	}
	
	//Devuelve radio
	double getRadio() {
		return this.radio;
	}
	
	//Muestra su estado
	public String toString() {
		return "Soy un c�rculo de radio "+getRadio()+". Ocupo un area de "+calculaArea()+" metros cuadrados";
	}
	
}
