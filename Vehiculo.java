/**
 * 
 */

/**
 * @author marcosgt11
 *
 */
public abstract class Vehiculo implements FabricaDeCoches{
	
	public String matricula;

	/**
	 * 
	 */
	public Vehiculo(String matricula) {
		// TODO Auto-generated constructor stub
		this.matricula = matricula;
	}
	
	//Getter
	/**
	 * @return Matricula del coche
	 */
	public String getMatricula() {
		return matricula;
	}
	
	//Setter
	/**
	 * @param matricula - Nueva matricula del coche
	 */
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public void reduceRuedasCoche(Coche a, Coche b) {
		//Secuencia de control while
				while(a.getNumeroRuedas() != b.getNumeroRuedas()){
					
					//Si el numero de ruedas del coche a es mayor que el del coche b
					if(a.getNumeroRuedas()>b.getNumeroRuedas()) {
						
						//Comparativa de la paridad o imparidad del numero de ruedas
						if((a.getNumeroRuedas()%2) == (b.getNumeroRuedas()%2)) {
							
							//Si son ambos numeros de ruedas pares o impares resto de dos en dos
							a.setNumeroRuedas(a.getNumeroRuedas()-2);
							
						}
						
						//Si no lo hago de uno en uno
						else {
							a.setNumeroRuedas(a.getNumeroRuedas()-1);
						}
						
					}
					
					//Caso contrario, el numero de ruedas del coche b sera mayor al de a
					else {
						
						if((a.getNumeroRuedas()%2) == (b.getNumeroRuedas()%2)) {
							
							b.setNumeroRuedas(b.getNumeroRuedas()-2);
							
						}
						
						else {
							b.setNumeroRuedas(b.getNumeroRuedas()-1);
						}
						
					}
					
				} 
	}

	abstract public int precioVehiculo();
}
