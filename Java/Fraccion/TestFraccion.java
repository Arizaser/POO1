package objetos;

public class TestFraccion {

	public static void main(String[] args) {
		Fraccion miFraccion=new Fraccion(2,3);
		System.out.println(miFraccion);
		
		
		miFraccion.sumarporFraccion(4, 2);
		System.out.println(miFraccion);
		
		miFraccion.simplificar();
		System.out.println(miFraccion);
		
		System.out.println(miFraccion.obtenerResultado());
		
		
	}

}
