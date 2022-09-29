package br.com.home.generics;


public class Main {

	public static void main(String[] args) {
		Buffer<String> b = new Buffer<>();
		b.adicionar("Bolo");
		b.adicionar("Torta");
		b.adicionar("Doce");
		
		for (String s : b.getBufferElements()) {
			System.out.print(s + " ");
		}

	}

}
