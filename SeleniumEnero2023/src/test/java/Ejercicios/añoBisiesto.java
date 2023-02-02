package Ejercicios;

public class añoBisiesto {
	public static int isLeapYear(int year) {
		if(year >=1 && year <=9999) {
			if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
				System.out.println(year + " true");
			}else {
				System.out.println(year + " false");
			}
		}
		return year;
	}


	public static void main(String[] args) {
		isLeapYear(4);
	}

}
