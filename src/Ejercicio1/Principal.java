package Ejercicio1;

public class Principal {
	///Punto 8 
	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[5];
		empleados[0] = new Empleado("Santiago",18);
		empleados[1] = new Empleado("Alvaro",79);
		empleados[2] = new Empleado("Eustaquio",26);
		empleados[3] = new Empleado();
		empleados[4] = new Empleado();
		
		empleados[3].setNombre("Ariana");
		empleados[3].setEdad(65);
		
		empleados[4].setNombre("Matias");
		empleados[4].setEdad(24);
		
		for(Empleado e : empleados) {			
		    System.out.println(e.toString());
		    System.out.println(Empleado.devuelveProximoID());
		}
	}
}
