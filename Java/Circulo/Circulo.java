package objetos;

import javax.swing.JOptionPane;

/**
 * Crea la clase “Circulo” en Java que responda al siguiente comportamiento:
 * 
 * Un círculo puede crecer. Aumenta su radio. 
 * Un círculo puede menguar. Decrementa su radio. 
 * Un círculo me devuelve su área si se la pido. 
 * Un círculo me dice su estado, por ejemplo “Soy un círculo de radio 0.5 metros. Ocupo un área de 
 * 0.7853981633974483 metros cuadrados” (método toString()).
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
	
	//Mengua el radio restándole n
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
	
	
	//Devuelve área
	double calculaArea() {
		return Math.PI*(radio*radio);
	}
	
	//Devuelve radio
	double getRadio() {
		return this.radio;
	}
	
	//Muestra su estado
	public String toString() {
		return "Soy un círculo de radio "+getRadio()+". Ocupo un area de "+calculaArea()+" metros cuadrados";
	}
	
}
