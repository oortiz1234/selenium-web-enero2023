package Ejercicios;

public class Impresora {

	public static void imprimirVerificadorNumeros (int var1, int var2, int var3) {
		if (var1 < 0 || var2 < 0 || var3 < 0) {
			System.out.println("Valor no válido");
		}else if (var1 == var2 && var1 == var3) {
			System.out.println("Iguales");
		}else if (var1 != var2 && var1 != var3 && var2 != var3) {
			System.out.println("Diferentes");
		}else{
			System.out.println("Ni iguales ni diferentes");
		}
	}
	
	public static void main(String[] args) {
		imprimirVerificadorNumeros(0, 2, 6);
	}

}
