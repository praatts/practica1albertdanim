package main;

public class practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sumArray = {4,36,4,23,867};
		int[] subArray = {785675, 56, 5675, 56544, 234};
		int[] prodArray = {6, 8, 20, 23, 12};
		
		
		// User 1 fer la suma dels elements de sumArray
		int suma = 0;
	    for (int i = 0; i < sumArray.length; i++){
	    	suma = suma + sumArray[i];
	    }
	    System.out.println("El resultado de la suma de los elementos del array sumArray es: " +suma);
		
		
		
		// User 2 fer la resta dels elements de subArray
		
		int resta = subArray[0];
		
		for (int i = 1; i < subArray.length; i++) {
			resta = resta - subArray[i];
			
		}
		
		System.out.println("El resultado de la resta de los elementos de el array 'subArray' es" + resta);
		
		// User 3 fer la multiplicació dels elements de prodArray
	}

}
