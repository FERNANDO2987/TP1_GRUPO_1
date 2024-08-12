package Ejercicio1;

public class Empleado {
	private final int id;
	private String nombre;
	private int edad;
	private static int cont = 1000;

	//Constructores
	public Empleado(String nombre, int edad)
	{
		this.id = cont;
		this.nombre = nombre;
		this.edad = edad;
		
		cont++;
	}
	
	//Getters y setters
	public int getId() {
		return id;
	}
	
	// Sin setId porque ahora es una constante
		
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}


