package br.com.home.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Bebida> bebidas = new ArrayList<>();
		bebidas.add(new Cafe());
		bebidas.add(new Cha());
		bebidas.add(new Cafe());
		bebidas.add(new Cha());

		prepararBebidas(bebidas);

		List<Cha> chas = new ArrayList<>();
		chas.add(new Cha());
		chas.add(new Cha());

		prepararBebidas(chas);

		List<Cafe> cafes = new ArrayList<>();
		cafes.add(new Cafe());
		cafes.add(new Cafe());

		prepararBebidas(cafes);

	}

	/** Recebe Objetos que herdam da classe passada como parâmetro */
	private static void prepararBebidas(List<? extends Bebida> bebidas) {
		for (Bebida b : bebidas) {
			b.preparar();
		}
	}

	/** Recebe Objetos super classe da classe passada como parâmetro */
	private static void prepararBebidas2(List<? super Cha> bebidas) {
		for (Object o : bebidas) {
			Cha cha = (Cha) o;
			cha.preparar();
		}
	}

	/** Recebe Objetos de qualquer classe passada como parâmetro */
	private static void prepararBebidas3(List<?> bebidas) {
		for (Object o : bebidas) {
			Cha cha = (Cha) o;
			cha.preparar();
		}
	}

}
