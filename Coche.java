import java.util.Scanner;

//Comentarios de una línea

/**
 * Comentarios de varias lineas
 *
 */

//Documentacion antes de cada clase

/** Clase Coche empleada para fabricar coches.
 * 
 * @author sacatucarrera
 * @version 1.0
 *
 */

public class Coche extends Vehiculo implements FabricaDeCoches{
int numeroRuedas;
boolean automatico = true;
int precio = 30;

	/**
	 * 
	 */
	public Coche(int NumeroRuedas, String matricula) {
		super(matricula);
		this.numeroRuedas = NumeroRuedas;
		// TODO Auto-generated constructor stub
	}
	
	//Enumerados
	
public enum TiposVehiculos{
	Coche("AAA",4), Moto("BBB",2), Camion("CCC",6), Furgoneta("DDD",4);
	
	private String LetrasMatricula;
	private int nRuedas;
	
	private TiposVehiculos(String LetrasMatricula,int nRuedas) {
		this.LetrasMatricula = LetrasMatricula;
		this.nRuedas = nRuedas;
	}
	
	public String getLetrasMatricula() {
		return LetrasMatricula;
	}
	
	public int getNRuedas() {
		return nRuedas;
	}
}

	public static void main(String[] args) throws Exception {
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
		
		//Demostración de las sentencias de código if-else-else if
		Coche trailer = new Coche(8,"AAA");
		Coche furgoneta = new Coche(3,"BBB");
		Coche tesla = new Coche(4,"CCC");
		
		comparaRuedasCoches(ferrari,trailer);
		comparaRuedasCoches(ferrari,furgoneta);
		comparaRuedasCoches(ferrari,tesla);
		
		//reduceRuedasCoche(furgoneta,trailer);
		//reduceRuedasCoche(furgoneta,trailer);
		
		identificaCoche(trailer.getNumeroRuedas());
		identificaCoche(ferrari.getNumeroRuedas());
		identificaCoche(furgoneta.getNumeroRuedas());
		
		sacaMatricula(ferrari.getMatricula());
		
		//Arrays
		Coche[] coches = new Coche[4];
		coches[1] = trailer;
		coches[2] = ferrari;
		coches[3] = furgoneta;
		coches[0] = tesla;
		
		for(int i = 0; i < coches.length;i++) { 
			
			System.out.println("El coche con identificador " + coches[i] + " tiene la matricula " + coches[i].getMatricula());
			
		}
		
		//Enumerados
		TiposVehiculos car = TiposVehiculos.Coche;
		TiposVehiculos moto = TiposVehiculos.Moto;
		TiposVehiculos.values();
		car.name();
		car.ordinal();
		car.compareTo(moto);
		car.getLetrasMatricula();
		
		System.out.println(Ejercicio1(1,2));
		
		Coche prueba = new Coche(4,"5555 SAC");
		leerMatriculas(prueba.getMatricula());
		
		ferrari.precioVehiculo();
		ferrari.getMatricula();
	}
	
	//Getter
	public int getNumeroRuedas() {
		return numeroRuedas;
	}
	
	//Setter
	/**
	 * @param nuevoNumeroRuedas - Nuevo numero de ruedas del coche
	 */
	public void setNumeroRuedas(int nuevoNumeroRuedas){
		numeroRuedas = nuevoNumeroRuedas;
	}
	
	//Metodo comparativo de ruedas de coches
	public static void comparaRuedasCoches(Coche a, Coche b) {
		
		//Lo primero es coger las ruedas de los coches
		int NumeroRuedasA = a.getNumeroRuedas();
		int NumeroRuedasB = b.getNumeroRuedas();
		
		//Secuencia de control if-else-else if
		if(NumeroRuedasA>NumeroRuedasB) {
			System.out.println("El numero de ruedas del primer coche es mayor que el numero de ruedas del segundo coche.");
		}
		else if(NumeroRuedasA == NumeroRuedasB) {
			System.out.println("El numero de ruedas de ambos coches es el mismo.");
		}
		else {
			System.out.println("El numero de ruedas del segundo coche es mayor que el numero de ruedas del primer coche.");
		}
		
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
	
	public static void identificaCoche(int NR){
		
		switch(NR) {
		
		case 4:
			//Lineas de codigo de cada caso del switch
			System.out.println("Este vehículo es un coche.");
			break;
			
		case 8:
			System.out.println("Este vehículo es un trailer o camion.");
			break;
			
		case 2:
			System.out.println("Este vehículo es una moto.");
			break;
			
		default:
			System.out.println("Este vehículo no esta identificado.");	
		
		}
		
	}
	
	public static void sacaMatricula(String matricula) {
		
		for(int i = matricula.length() - 1; i >= 0;i--) { 
			
			System.out.println(matricula.charAt(i));
			
		}
		
	}
	
	//EXCEPCIONES
	
	/**
	 * Ejercicio 1. Cree un metodo para calcular el resultado de la serie: 
	 * sumatorio desde k hasta n de (3k - 2/(n-3))
	 */
	
	//Documentacion antes de cada metodo
	
	/** Ejercicio 1. Calcula la serie especificada en el enunciado.
	 * 
	 * @param k - Valor k de la serie especificada
	 * @param n - Valor n de la serie especificada
	 * @return int - Entero resultado de completar la serie dados k y n
	 * @throws Exception - Lanza excepcion de division entre 0 cuando el valor de n = 3
	 */
	
public static int Ejercicio1 (int k, int n) throws Exception{

	if(n == 3) {
		throw new ArithmeticException("El valor de n provoca una division entre 0");
	}
	int resultado = 0;
	
//	try {
//	
//	for(int i = k; i <= n; i ++) {
//	resultado += (3*i - 2/(n-3));
//	}
//	
//	}
//	catch(Exception e){
//		
//		System.out.print("Hemos detectado la excepcion" + e);
//		
//	}
		
		for(int i = k; i <= n; i ++) {
		resultado += (3*i - 2/(n-3));
		}
			
	return resultado;
	
}

//Scanner

public static void leerMatriculas(String matricula) {
	Scanner sc = new Scanner(matricula);
	
	// Formato matricula Caracteres Enteros
	if(sc.hasNext()) {
		String mat = sc.next();
		
		if(sc.hasNextInt()) {
			int mat2 = sc.nextInt();
			System.out.println("El coche detectado tiene la matricula " + mat + " " + mat2);
		}
		else {
			System.out.println("La matricula leida no posee el formato correcto");
		}
	}
	else {
		System.out.println("La matricula leida no posee el formato correcto");
	}
	
	sc.close();
}

@Override
public int precioVehiculo() {
	System.out.println("El precio del vehiculo es de " + 30*4 + " euros.");
	// TODO Auto-generated method stub
	return 30*4;
}
	
}
