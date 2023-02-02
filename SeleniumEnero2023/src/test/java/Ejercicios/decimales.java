package Ejercicios;

public class decimales {

	public static boolean areEqualBythreeDecimalPlaces(double var1, double var2) {
		int var3 = (int) (var1 * 1000);
		int var4 = (int) (var2 * 1000);
		
		if(var3 == var4){
			//System.out.println("Iguales");
			return true;
			
		}else {
			//System.out.println("No son iguales");
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		double var1 = 1.121;
		double var2 = 1.1233333;
		System.out.println(areEqualBythreeDecimalPlaces(var1, var2));
	}

}
