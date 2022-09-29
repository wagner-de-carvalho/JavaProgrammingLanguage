package br.com.home.innerclass;

public class Main {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		c.setValor1(20);
		c.setValor2(12);
		int soma = c.somar();
		System.out.println(soma);

	}

}
