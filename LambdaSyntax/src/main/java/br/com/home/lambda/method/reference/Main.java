package br.com.home.lambda.method.reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
//		List<Integer> list = new ArrayList<>();
//		list.add(7);
//		list.add(4);
//		list.add(3);
//		list.add(1);
//		list.add(22);
//		list.add(12);
//		list.add(57);
//		list.add(39);
//		list.add(41);

//		List<Integer> list = Arrays.asList(7, 4, 3, 1, 22, 12, 57, 39, 41, 28);
//		list.forEach(System.out::println);
		
		List<String> nomes = Arrays.asList("banana", "maçã", "uva", "pêra", "caju", "mamão");
//		nomes.replaceAll(e -> e.toUpperCase());
		nomes.replaceAll(String::toUpperCase);
		nomes.forEach(System.out::println);
		
		
	}

}
