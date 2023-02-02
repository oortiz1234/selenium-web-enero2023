package Ejercicios;

public class gatoJugando {
	

	public static boolean isCatPlaying (boolean verano, int temperatura){
		if(verano == false && temperatura >= 25 && temperatura <= 35 ) {	
			return true;
		}else {
		    return false;
		}
		
	}
	
	public static void main(String[] args) {
		boolean verano = false;
		int temperatura = 25;
		System.out.println(isCatPlaying(verano, temperatura));
	}

}
