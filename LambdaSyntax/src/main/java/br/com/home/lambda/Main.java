package br.com.home.lambda;

public class Main {

	public static void main(String[] args) {
		Calculator c = e -> e = e * e;
		c.calculate(20);
		
		Calculator2 c2 = e -> e * e;
		int valor = c2.calculate(12);
		System.out.println(valor);
		
		

	}

}
