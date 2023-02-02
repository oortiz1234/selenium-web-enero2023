package Ejercicios;

public class sumaNumero {
	
	public static boolean hasEqualSum (int var1, int var2, int var3){
		if(var1+var2 == var3 ) {	
			return true;
		}else {
		    return false;
		}
	}

	public static void main(String[] args) {
		int var1 = 1;
		int var2 = 1;
		int var3 = 2;
		System.out.println(hasEqualSum(var1, var2, var3));

	}

}
