package br.com.home.reflection;

public class MinhaClasse {

	@Executar("A")
	public void m1(String param) {
		System.out.println("m1() " + param);
	}

	public void m2(String param) {
		System.out.println("m2() " + param);
	}

	@Executar(value = "Y")
	public void m3(String param) {
		System.out.println("m3() " + param);
	}

}
