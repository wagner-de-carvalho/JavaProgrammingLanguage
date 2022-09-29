package br.com.br.innerclass.staticclass;

public class Outer {
	private int x = 15;

	class Inner {
		private int x = 10;

		public void m1() {
			System.out.println(this.x);
			System.out.println(Outer.this.x);
		}
	}

	public void m2() {
		System.out.println(this.x);

		Inner i = new Inner();
		i.m1();
	}

}
