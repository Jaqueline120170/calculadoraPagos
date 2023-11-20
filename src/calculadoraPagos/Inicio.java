package calculadoraPagos;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		double importe;
		System.out.println("Introduzca el importe de la primera cuota a pagar");
		importe = sc. nextDouble();
		
		int meses;
		System.out.println("Introduzca plazo correspondiente el nùmero de meses en que desea pagar");
		meses = sc.nextInt();
		
		double totalPagado = 0;
		
		
		
		for(int i=1; i <= meses; i++) {
			
			System.out.println("Importe" + 1 + ": " + importe);
			totalPagado= totalPagado + importe;
			importe = importe * 2;	
		}
		System.out.println("Total pagado por el producto adquidido: " + (int)totalPagado);


	}

}
