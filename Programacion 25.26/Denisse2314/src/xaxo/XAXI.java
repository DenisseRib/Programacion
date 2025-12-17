package xaxo;

public class XAXI { 

	public static void main(String[] args) {
System.out.print("HOOOOOOOOOOOOOOOLAAAAAAAAA");
float medida = 1.6f;
System.out.print("mido " + medida + "cm");
char letra = 'D' + 5;
System.out.print("Mi letra inicial " + letra );
char vocal = '@';
System.out.println("Mi inicial es "+ letra + " "+ "y mi instagram empieza"+" " + vocal);

int a =10;
int b = 20;
boolean suma = (a+b == 30);
boolean adiferenteb = a!= b ;
System.out.print(adiferenteb);
System.out.println(suma);
String holamundo = "XAITO ";
System.out.println(holamundo);
String holaMundo = "Hola Mundo ";
String holaMundo1 = " Hola Mundo ";
String adios = "AdiosMundo";
System.out.print(holaMundo.substring(5));
System.out.print(holaMundo1.replace('o' ,'a'));
System.out.print(adios.equals(holaMundo1));
System.out.println(adios.equals("AdiosMundo"));
String nombre = "Denisse";
String apellido = "Ribera Fernandez";
String aficion = "Fitness";
System.out.print("mi nombre es " + nombre + "  "+  "y mi apellido es " + apellido + " " + "mi aficion favorita es " + aficion );
int longitud= nombre.length();
System.out.println("Mi nombre tiene " + longitud +  " " + "letras");
String nombreMayus= nombre.toLowerCase();
String ApellidoMayus=apellido.toLowerCase();
System.out.println("Escribo todo en minuscula  " + nombreMayus + "  y mi apellido también  " + ApellidoMayus);
String ApellidoMinus = apellido.toUpperCase();
String Nombreminus = nombre.toUpperCase();
System.out.println("Escribo mi nombre en mayuscula  " + Nombreminus+ " " + "y mi apellido tambien"+ " "+ ApellidoMinus );




	}
}
