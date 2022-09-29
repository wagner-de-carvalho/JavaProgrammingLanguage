package br.com.br.innerclass.method;

public class Main {

	public static void main(String[] args) {

		final String t2 = "Este é o texto t2";

		class Texto {
			private String t;

			public Texto(String t) {
				this.t = t;
			}

			public void imprimir() {
				System.out.println(t);
			}

			public void imprimir2() {
				System.out.println(t2);
			}
		}

		Texto t = new Texto("Este é meu texto");
		t.imprimir();
		t.imprimir2();
	}

}
