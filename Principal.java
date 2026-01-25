package ejercicio10POO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) throws IOException {
		 BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
ArrayList<Empleado> empleados = new ArrayList<Empleado>();
boolean salir= false;
int opcion = 0 ;
		// TODO Auto-generated method stub
do {
	System.out.println("== GESTION EMPLEADOS ==");
	System.out.println("1.Registrar empleado");
	System.out.println("2.Mostrar todos");
	System.out.println("3. Buscar por DNI");
	System.out.println("4. Mostrar por departamento");
	System.out.println("7. Salir");
	System.out.println("Introduce una opcion: ");
	 opcion = Integer.parseInt(leer.readLine());

	switch (opcion) {
	case 1:
		contratarEmpleado(empleados);
		break;
	case 2:
		mostrarDatos(empleados);
		break;
	case 3:
		buscarPorDni(empleados);
		break;
	case 4:
		mostrarPorDepartamento(empleados);
		break;
	
	case 7:
		System.out.println("Saliendo...");
		salir = true;
		break;
	default:
		System.out.println("Opcion no valida");
	}

} while (!salir);}

	public static void contratarEmpleado(ArrayList<Empleado> empleados) throws IOException {
		for(Empleado e : empleados) {
			e.contratarEmpleado();
		}}
		
		public static void  buscarPorDni (ArrayList <Empleado>empleados) throws IOException {
			BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
			int dni = -1;
			boolean todoOk = false;
			boolean enc = false;
			do {
				try {
					System.out.println("Introduce un DNI para buscar");
					dni = Integer.parseInt(leer.readLine());
					todoOk =true;
					
				}catch (NumberFormatException e) {
					e.printStackTrace();
				}
				for (int e = 0 ; e <empleados.size() || !enc ;  e++) {
					if(empleados.get(e).getDNI() == dni) {
						empleados.get(e).mostrarDatos();
						enc = true;
						
					}
					if(enc=false) {
						System.out.println("No encontrado");
					}
				}
				
			}while(todoOk != true);
			
		
	}
	public static void mostrarDatos(ArrayList<Empleado> empleados) {
		for (Empleado e :  empleados) {
			e.mostrarDatos();
		}
	}
	public static void mostrarPorDepartamento(ArrayList <Empleado> empleados) throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		boolean todoOk = false;
		boolean enc= false;

		System.out.println("Introduce nombre de departamento a buscar ( \"ventas\", \"marketing\", \"produccion\" o \r\n"
				+ "\"administracion\".)");
		String nomDep = leer.readLine();
		do {
			if(nomDep.equalsIgnoreCase("ventas")||nomDep.equalsIgnoreCase("marketing")|| nomDep.equalsIgnoreCase("produccion")|| nomDep.equalsIgnoreCase("administracion")) {
				todoOk = true;
			}
			else {
				System.out.println("Introduce un nombre departamento correcto");
			}
			
			
		}while(todoOk == false);
		
		
		
		for (int i = 0 ; i < empleados.size() || !enc ; i++) {
			if (empleados.get(i).verificarDepartamento().equalsIgnoreCase(nomDep)) {
				System.out.println(empleados.get(i).getNombre());
				enc=true;
			}
			
			
		}
		if(enc == false) {
			System.out.println("No encontrado");
		}
		
	
}}


