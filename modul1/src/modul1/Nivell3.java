/*Declara un array de numeros int e inicialitzala amb valors del 1 al 10
Rota l’array sense utilitzar un array auxiliar ni llibreries. Pots utilizar una variable auxiliar.*/


package modul1;

public class Nivell3 {

	public static void main(String[] args) {
		
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i=0; i<array.length; i++) {
		System.out.print(array[i] + " ");
		}
		
		System.out.println("\nResultat de la inversió: ");
		
		for (int i=9; i >= 0; i--) { 
			System.out.print(array[i] + " ");
		
	}
	
}
	
}