/*Partint de l�any 1948 heu de fer un bucle for i mostrar els anys de trasp�s fins arribar al vostre any de 
naixement. 
ATENCIO! Haureu de canviar el tipus de variable de l�any 1948 per poder modificar-la. 
Creeu una variable bool que sera certa si l�any de naixement �s de trasp�s o falsa si no ho �s.
En cas de que la variable bool sigui certa, heu de mostrar per consola una frase on ho digui, en cas de 
ser falsa mostrareu la frase pertinent. Creeu dues variables string per guardar les frases.
*/

package modul1;

public class Nivell1Fase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int anyInici = 1948;
		int anyNaixement = 1979;
		int anyFor = 0;
		int cicle = 4;
		int i = 0;
		boolean variable = false;
		String cert = " �s un any de trasp�s";
		String fals = " no �s un any de trasp�s";
		int anysTraspas = 0;
		
		for (i = 0; anyFor<anyNaixement; i++) {
			anyFor = anyInici + i;
			if (anyFor % cicle == 0) {
				variable = true;
			}else {
				variable = false;
			}
								
			if(variable == true) {
				System.out.println("L'any " + anyFor + cert);
				anysTraspas++;
			}else {
				System.out.println("L'any " + anyFor + fals);
			}		
		}
		
		System.out.println ("En total hi han hagut " + anysTraspas + " anys de tr�spas des de l'any " + anyInici + " fins l'any " 
		+ anyNaixement + "\nFins al pr�xim exercici!");
	}	
		
}

