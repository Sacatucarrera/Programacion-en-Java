/**
 * 
 */

/**
 * @author marcosgt11
 *
 */
public class Coche {
int numeroRuedas;
String matricula;
boolean automatico = true;
	/**
	 * 
	 */
	public Coche(int NumeroRuedas, String mat) {
		this.numeroRuedas = NumeroRuedas;
		matricula = mat;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola estudiantes!!");
		Coche ferrari = new Coche(4,"sacatucarrera");
		System.out.println(ferrari);
		
		System.out.println(ferrari.getMatricula());
		//Uso de getters y setters
		int nr = ferrari.getNumeroRuedas();
		System.out.println(nr);
		ferrari.setMatricula("Aprobadisimos");
		String matriculaNueva = ferrari.getMatricula();
		System.out.println(matriculaNueva);
	}
	
	//Getter
	public int getNumeroRuedas() {
		return numeroRuedas;
	}
	
	//Setter
	public void setNumeroRuedas(int nuevoNumeroRuedas){
		numeroRuedas = nuevoNumeroRuedas;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
