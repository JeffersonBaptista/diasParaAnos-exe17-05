package com.br.anos.para.dias;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int anos = 0;
		int meses = 0;
		int dias = 0;
		int total =0;
		
		
		System.out.println("Converssor de tempo de vida em dias de vida");
		System.out.println("Informe sua idade em anos - meses - dias");
		
		System.out.println("Anos");		
		anos = scan.nextInt() * 365;
		
		System.out.println("Meses");		
		meses = scan.nextInt() * 30;
		
		System.out.println("dias");		
		dias = scan.nextInt();
		
		total = anos + meses + dias;
		
		System.out.println("Você possui " + total + " dias de vida" );

	}

}
