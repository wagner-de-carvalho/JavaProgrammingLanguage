package br.com.br.innerclass.anonymous;

public class Main {

	public static void main(String[] args) {
		
		Bebida b1 = new Cha();
		b1.preparar();
		
		Bebida b2 = new Bebida() {
			@Override
			public void preparar() {
				System.out.println("Preparando outra bebida");
			}
		};
		
		b2.preparar();

	}

}
