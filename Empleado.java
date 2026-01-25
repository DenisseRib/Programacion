package ejercicio10POO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
public class Empleado {
	Random  random = new Random();;
	private String nombre;
	private String Departamento;
	private  Double Salario;
	int DNI = 10_000_000  + random.nextInt(90_000_000);

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDepartamento() {
		return Departamento;
	}
	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	public Double getSalario() {
		return Salario;
	}
	public void setSalario(Double salario) {
		Salario = salario;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public void dniRepetido( int DNI) {
		this.DNI = DNI;
		if(DNI == DNI  ) {
			System.out.println(" He repetido ");
			this.DNI = 10_000_000  + random.nextInt(90_000_000);
		}
	}
	public String verificarDepartamento() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		if(!Departamento.equalsIgnoreCase("Ventas")&& !Departamento.equalsIgnoreCase("marketing")&& !Departamento.equalsIgnoreCase("Produccion")&& Departamento.equalsIgnoreCase("administracion")) {
			System.out.println("Departamento incorrecto, vuelve a introducir un departamento ");
			Departamento = br.readLine();
		}
		return Departamento;
		
		
	}
	public void contratarEmpleado() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce el nombre");
		nombre = br.readLine();
		System.out.println("Introduce departamento ");
		Departamento = br.readLine();
		verificarDepartamento();
		System.out.println("Hemos asignado tu dni:  " +this.DNI );
		 ;
	}
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("\t DNI: " + DNI);
		System.out.println("\t Departamento: " + Departamento);
	}
}
