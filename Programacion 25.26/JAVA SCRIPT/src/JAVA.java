
public class JAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String frase = "Programar en Java es divertido";
int longitud = frase.length();
System.out.println("La frase escrita tiene " + longitud + " " + "letras ");
String palabra = frase.substring(12, 17);
System.out.println("" + palabra);
CharSequence phyton;
String reemplazo = frase.replace("Java", "phyton");
System.out.println(reemplazo);
String FraseMayus = frase.toUpperCase();
System.out.println(FraseMayus);
boolean cadena = frase.startsWith("Programar");
System.out.println(cadena);
//EJERCICIO 10
int variable1=15;
int variable2=8;
String.valueOf(variable2 + variable1);
System.out.println( variable2 + variable1);
System.out.println(  variable2 - variable1);
System.out.println(variable2 * variable1);
System.out.println(variable2 /variable1);
//EJERCICIO 11
float ancho = 5.5f;
float alto = 3.2f;
System.out.println("Area es " + ancho * alto);
System.out.println("Perimetro es " + 2*( ancho + alto ));



	}

}
