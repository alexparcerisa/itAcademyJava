/*Declara una variable double. Assigna-li un valor amb 4 decimals.
 Declara variables de tipus: int, float i string.
 Fes un "cast" de la variable double a cada una de les variables que has creat anteriorment per inicialitzar-les i pinta-les per pantalla.*/


package modul1;

public class Nivell2 {

	public static void main(String[] args) {
	
	double xifra = 7.5684;
	int a;
	float  b;
	String c = "";
	
	a= (int)xifra;
	b = (float)xifra;
	c = String.valueOf(xifra);
;
	
	System.out.println("double: " + xifra);
	System.out.println("int: " + a);
	System.out.println("float: " + b);
	System.out.println("String: " + c);
	
	}
}
